package com.example.tech_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodsActivity extends AppCompatActivity {
    private TextView foods_id;
    private TextView foods_title;
    private TextView foods_source;
    RecyclerView recyclerView;
    private FoodsAdapter adapter;
    FoodInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        recyclerView = findViewById(R.id.foods_rec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        foods_id = findViewById(R.id.foods_id);
        foods_title = findViewById(R.id.foods_title);
        foods_source = findViewById(R.id.foods_source);
        foodsDetails();
    }

    private void foodsDetails() {
        apiInterface = Retrofit_foods.getRetrofit().create(FoodInterface.class);
        apiInterface.getfoods().enqueue(new Callback<List<Foods>>() {
            @Override
            public void onResponse(Call<List<Foods>> call, Response<List<Foods>> response) {
                List<Foods> foodsList = response.body();
                for (int i=0;i<foodsList.size();i++){
                    adapter = new FoodsAdapter((ArrayList<Foods>)foodsList);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onFailure(Call<List<Foods>> call, Throwable t) {

            }
        });
    }
}