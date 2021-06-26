package com.example.tech_final;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodInterface {
    @GET("https://api.spoonacular.com/recipes/715538/similar?apiKey=240e5b9b15d34fa3a4a9de3d17002882")
    Call<List<Foods>> getfoods();
}
