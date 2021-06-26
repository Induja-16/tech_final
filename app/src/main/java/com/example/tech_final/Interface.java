package com.example.tech_final;
import android.view.MenuItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {
    @GET("recipes/complexSearch?apiKey=240e5b9b15d34fa3a4a9de3d17002882")
    Call<Menu>getData();

}
