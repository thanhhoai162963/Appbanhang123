package com.example.appbanhang.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NhoAPIService {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/foodapp/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    }
}
