package com.example.raghav.multilibrariesproject;

import android.app.Application;

import com.example.raghav.multilibrariesproject.mvp.components.DaggerEmployeeFragmentComponent;
import com.example.raghav.multilibrariesproject.mvp.components.DaggerEmployeePresenterComponent;
import com.example.raghav.multilibrariesproject.mvp.components.EmployeeFragmentComponent;
import com.example.raghav.multilibrariesproject.mvp.components.EmployeePresenterComponent;

/**
 * Created by raghav on 9/27/16.
 */

public class MyApplication extends Application
{
    EmployeePresenterComponent employeePresenterComponent;
    EmployeeFragmentComponent employeeDetailFragmentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        employeePresenterComponent = DaggerEmployeePresenterComponent.builder().build();

        employeeDetailFragmentComponent = DaggerEmployeeFragmentComponent.builder().build();
    }

    public EmployeePresenterComponent getComponent() {
        return employeePresenterComponent;
    }

    public EmployeeFragmentComponent getEmployeeFragmentComponent() {
        return employeeDetailFragmentComponent;
    }
}

