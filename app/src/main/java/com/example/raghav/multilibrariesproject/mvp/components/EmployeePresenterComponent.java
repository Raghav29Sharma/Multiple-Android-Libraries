package com.example.raghav.multilibrariesproject.mvp.components;

import com.example.raghav.multilibrariesproject.mvp.EmployeeDetailFragment;
import com.example.raghav.multilibrariesproject.mvp.modules.EmployeePresenterModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by raghav on 9/27/16.
 */
@Singleton
@Component(modules = {EmployeePresenterModule.class})
public interface EmployeePresenterComponent
{
    void inject(EmployeeDetailFragment EmployeeView);
}
