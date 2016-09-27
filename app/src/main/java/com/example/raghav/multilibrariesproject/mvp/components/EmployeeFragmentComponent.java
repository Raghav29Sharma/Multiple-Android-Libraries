package com.example.raghav.multilibrariesproject.mvp.components;

import com.example.raghav.multilibrariesproject.mvp.EmployeeDetailAcitivity;
import com.example.raghav.multilibrariesproject.mvp.modules.EmployeeFragmentModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by raghav on 9/27/16.
 */

@Singleton
@Component(modules = {EmployeeFragmentModule.class})
public interface EmployeeFragmentComponent
{
    void inject(EmployeeDetailAcitivity EmployeeView);
}
