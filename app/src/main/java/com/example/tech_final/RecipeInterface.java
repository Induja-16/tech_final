package com.example.tech_final;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecipeInterface {
    @GET("food/menuItems/424571?apiKey=240e5b9b15d34fa3a4a9de3d17002882")
    Call<Model> getRecp();


}
