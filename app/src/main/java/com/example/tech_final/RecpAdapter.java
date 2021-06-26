package com.example.tech_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecpAdapter extends RecyclerView.Adapter<RecpAdapter.ViewHolder> {
    private ArrayList<Nutrients> arrayList;

    public RecpAdapter(ArrayList<Nutrients> arrayList) {
        this.arrayList =arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recp_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(arrayList.get(position).getName());
        holder.amount.setText(arrayList.get(position).getAmount());
        holder.unit.setText(arrayList.get(position).getUnit());
        holder.percentOfDailyNeeds.setText(arrayList.get(position).getPercentOfDailyNeeds());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class
    ViewHolder extends RecyclerView.ViewHolder {
        TextView name,amount,unit,percentOfDailyNeeds;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_rec1);
            amount = itemView.findViewById(R.id.amt1);
            unit = itemView.findViewById(R.id.unit1);
            percentOfDailyNeeds = itemView.findViewById(R.id.perc1);

        }
    }
}
