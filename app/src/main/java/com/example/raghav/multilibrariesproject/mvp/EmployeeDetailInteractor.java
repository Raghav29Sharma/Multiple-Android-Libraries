package com.example.raghav.multilibrariesproject.mvp;

import android.support.annotation.NonNull;

import com.example.raghav.multilibrariesproject.interfaces.RestServiceInterface;
import com.example.raghav.multilibrariesproject.models.Citizen;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by raghav on 9/26/16.
 */


public class EmployeeDetailInteractor implements IEmployeeDetailInteractor
{
    private IEmployeePresenter employeePresenter;
    @NonNull
    private String baseUrl;

    public EmployeeDetailInteractor(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public void setPresenter(IEmployeePresenter employeePresenter) {
        this.employeePresenter = employeePresenter;
    }

    @Override
    public void getEmployeeDetais()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(baseUrl)
                //.baseUrl("https://jsonplaceholder.typicode.com/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        RestServiceInterface service = retrofit.create(RestServiceInterface.class);
        Observable<List<Citizen>> observable = service.loadCitizensRx();

        observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Citizen>>()
        {
            @Override
            public void onCompleted()
            {

            }

            @Override
            public void onError(Throwable throwable)
            {
                System.out.println(throwable);
            }

            @Override
            public void onNext(@NonNull List<Citizen> citizens)
            {
                System.out.println(citizens);
                employeePresenter.setEmployeeDetails(citizens);

            }
        });
    }
}



