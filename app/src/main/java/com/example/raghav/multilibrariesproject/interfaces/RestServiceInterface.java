package com.example.raghav.multilibrariesproject.interfaces;

import com.example.raghav.multilibrariesproject.models.Citizen;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface RestServiceInterface {

	  @GET("users")
	  Observable<List<Citizen>> loadCitizensRx();

}
