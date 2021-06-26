package com.example.tech_final;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private DataAdapter adapter;
    Interface apiInterface;
    private  Button rec_btn;
    private Button food_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadData();
        rec_btn = findViewById(R.id.rec_btn);
        food_btn =findViewById(R.id.food_btn);
        rec_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecipeActivity();
            }

        });
        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFoodsActivity();
            }
        });


    }

    public void openRecipeActivity(){
        Intent intent = new Intent(this,RecipeActivity.class);
        startActivity(intent);
    }
    public void openFoodsActivity(){
        Intent intent= new Intent(this,FoodsActivity.class);
        startActivity(intent);
    }


    private void loadData() {
        apiInterface = Retrofit_menu.getRetrofit().create(Interface.class);
        apiInterface.getData().enqueue(new Callback<Menu>() {
            @Override
            public void onResponse(Call<Menu> call, Response<Menu> response) {
                if (response.isSuccessful()){
                    List<Results> resultList = response.body().getResults();
                    for (int i =0; i< resultList.size();i++){
                     adapter= new DataAdapter((ArrayList<Results>)resultList);
                     recyclerView.setAdapter(adapter);
                     adapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<Menu> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT);
            }
        });
     }


}