package com.example.tech_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
private ArrayList<Results> arrayList;
    public DataAdapter(ArrayList<Results> arrayList){
        this.arrayList =arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardlayout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int i) {


        viewholder.title.setText(arrayList.get(i).getTitle());
        viewholder.id.setText(arrayList.get(i).getId());
        Picasso.get().load(arrayList.get(i).getImage()).placeholder(R.drawable.ic_launcher_background).fit().into(viewholder.img_view);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,id;
        ImageView img_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            id = itemView.findViewById(R.id.id);

            img_view = itemView.findViewById(R.id.img_view);

        }
    }
}
