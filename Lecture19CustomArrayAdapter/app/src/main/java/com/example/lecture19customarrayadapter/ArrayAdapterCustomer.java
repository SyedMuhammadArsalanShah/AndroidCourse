package com.example.lecture19customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class ArrayAdapterCustomer extends ArrayAdapter {
    ArrayList<Data> dataArrayList = new ArrayList<>();
    Context context;

    public ArrayAdapterCustomer(@NonNull Context context, int resource, @NonNull  ArrayList<Data> dataArrayList) {
        super(context, resource, dataArrayList);

        this.dataArrayList = dataArrayList;
        this.context= context;


    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.gridview, null);
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textView = convertView.findViewById(R.id.text);
        imageView.setImageResource(dataArrayList.get(position).getImages());
        textView.setText(dataArrayList.get(position).getName());
        return convertView;
    }
}
