package com.example.lecture29recyclerviewwithcardview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {
    Context context;
    ArrayList<Item> arrayList;

    public ItemAdapter(Context context, ArrayList<Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list,parent, false);
        ItemHolder itemHolder =new ItemHolder(view);


        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.textView.setText(arrayList.get(position).getName());
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context,Detail.class);
                intent.putExtra("name", arrayList.get(position).getName());
                intent.putExtra("image", arrayList.get(position).getImage());
                intent.putExtra("des", arrayList.get(position).getDes());
                context.startActivity(intent);
            }
        });






    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
