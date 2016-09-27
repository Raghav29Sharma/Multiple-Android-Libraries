package com.example.raghav.multilibrariesproject.mvp;

import com.example.raghav.multilibrariesproject.models.Citizen;

import java.util.List;

/**
 * Created by raghav on 9/26/16.
 */

public interface IEmployeeView
{


    void setData(List<Citizen> citizens);

    void showLoader();

    void hideLoader();
}
