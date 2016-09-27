package com.example.raghav.multilibrariesproject.mvp;

import com.example.raghav.multilibrariesproject.models.Citizen;

import java.util.List;

/**
 * Created by raghav on 9/26/16.
 */

public class EmployeePresenter implements IEmployeePresenter
{
    private IEmployeeView employeeView;
    private IEmployeeDetailInteractor employeeDetailInteractor;
    private List<Citizen> citizens;

    @Override
    public void setEmployeeDetails(List<Citizen> citizens)
    {
        this.citizens = citizens;
        setEmployeeDetailsInView();
    }


    @Override
    public void setEmployeeView(IEmployeeView employeeView)
    {
        this.employeeView = employeeView;
        employeeView.showLoader();
        setEmployeeInteractor();

    }

    @Override
    public void setEmployeeInteractor()
    {
        employeeDetailInteractor = new EmployeeDetailInteractor("https://jsonplaceholder.typicode.com/");
        employeeDetailInteractor.setPresenter(this);
        employeeDetailInteractor.getEmployeeDetais();
    }

    @Override
    public void setEmployeeDetailsInView()
    {
        employeeView.hideLoader();
        employeeView.setData(citizens);
    }


}
