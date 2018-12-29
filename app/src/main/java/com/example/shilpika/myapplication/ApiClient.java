package com.example.shilpika.myapplication;

/**
 * Created by Shilpika on 24/11/18.
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ApiClient {

    private static final String BaseUrl = "http://172.20.10.2:5000/";
    private static Retrofit retrofit;

    public static Retrofit getApiClient() {

        retrofit = new Retrofit.Builder().baseUrl(BaseUrl).
                addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit;
    }
}