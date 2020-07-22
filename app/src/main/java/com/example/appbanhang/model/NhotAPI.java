package com.example.appbanhang.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NhotAPI {

    @GET("fooddata.json")
    Call<List<FoodData>> getAllData();


}
