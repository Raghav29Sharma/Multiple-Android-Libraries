package com.example.raghav.multilibrariesproject.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.example.raghav.multilibrariesproject.MyApplication;
import com.example.raghav.multilibrariesproject.R;

import javax.inject.Inject;

public class EmployeeDetailAcitivity extends AppCompatActivity
{
    @NonNull
    @Inject
    EmployeeDetailFragment employeeDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication)getApplication()).getEmployeeFragmentComponent().inject(this);
        setFragment();
    }

    private void setFragment() {
        getFragmentManager().beginTransaction()
                .add(R.id.container, employeeDetailFragment).commit();
    }
}
