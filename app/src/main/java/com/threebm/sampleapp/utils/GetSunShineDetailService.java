package com.threebm.sampleapp.utils;

import com.threebm.sampleapp.model.SunShineDetailData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetSunShineDetailService {
    @GET("/api/forecastdetails")
    Call<SunShineDetailData> getSunShineDetails(@Query("sign")String sunShineName, @Query("day")String day, @Query("tz")String tz);
}

