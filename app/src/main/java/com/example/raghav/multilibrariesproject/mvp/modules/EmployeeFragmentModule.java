package com.example.raghav.multilibrariesproject.mvp.modules;

import com.example.raghav.multilibrariesproject.mvp.EmployeeDetailFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raghav on 9/27/16.
 */
@Module
public class EmployeeFragmentModule
{
    @Provides
    @Singleton
    public EmployeeDetailFragment getEmployeeFragment() {
        return EmployeeDetailFragment.getInstance();
    }
}
