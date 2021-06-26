package com.example.tech_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsAdapter.ViewHolder> {
    private ArrayList<Foods> arrayList;

    public FoodsAdapter(ArrayList<Foods> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foods_layout,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setText(arrayList.get(position).getId());
        holder.title.setText(arrayList.get(position).getTitle());
        holder.sourceUrl.setText(arrayList.get(position).getSourceUrl());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id,title,sourceUrl;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.foods_id);
            title = itemView.findViewById(R.id.foods_title);
            sourceUrl = itemView.findViewById(R.id.foods_source);
        }
    }
}
