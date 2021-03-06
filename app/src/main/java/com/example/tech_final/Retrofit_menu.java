package com.example.tech_final;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_menu {
    private static String baseUrl = "https://api.spoonacular.com/";

    static Gson gson = new GsonBuilder().setLenient().create();
    private static retrofit2.Retrofit retrofit;
    public static retrofit2.Retrofit getRetrofit()
    {
        if (retrofit==null){
            retrofit = new retrofit2.Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;
    }

}
