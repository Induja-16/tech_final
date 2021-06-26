package com.example.tech_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecipeActivity extends AppCompatActivity {
    RecipeInterface apiInterface;
    private  TextView name_rec;
    private TextView title_rec;
    private TextView amt;
    private TextView unit;
    private TextView perc;
    private RecpAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        recyclerView=findViewById(R.id.rec_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        name_rec = findViewById(R.id.name_rec);
        title_rec= findViewById(R.id.title_rec);
        amt =findViewById(R.id.amt);
        unit = findViewById(R.id.unit);
        perc = findViewById(R.id.perc);
        loadDetails();
        //loadDetails2();

    }
    private void loadDetails(){
        apiInterface =Retrofit_recp.getRetrofit().create(RecipeInterface.class);
        apiInterface.getRecp().enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                name_rec.setText(response.body().getTitle());

                List<Nutrients> nutrientsList = response.body().getNutrition().getNutrients();
                for (int i =0; i< nutrientsList.size();i++){
                    adapter= new RecpAdapter((ArrayList<Nutrients>)nutrientsList);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }
        });

    }


}