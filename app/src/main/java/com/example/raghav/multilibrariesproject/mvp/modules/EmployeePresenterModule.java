package com.example.raghav.multilibrariesproject.mvp.modules;

import com.example.raghav.multilibrariesproject.mvp.EmployeePresenter;
import com.example.raghav.multilibrariesproject.mvp.IEmployeePresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raghav on 9/27/16.
 */
@Module
public class EmployeePresenterModule
{
    @Provides
    @Singleton
    public IEmployeePresenter getEmployeePresenter() {
        return new EmployeePresenter();
    }
}
