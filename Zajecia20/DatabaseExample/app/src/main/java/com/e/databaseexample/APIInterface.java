package com.e.databaseexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface APIInterface {

    @GET("/json?")
    Call<List<Temperature>> getTemperature(@Query("limit") int limit, @Query("sensor") int sensor);
}
