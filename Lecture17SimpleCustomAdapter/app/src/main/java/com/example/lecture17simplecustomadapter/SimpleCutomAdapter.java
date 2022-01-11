package com.example.lecture17simplecustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SimpleCutomAdapter extends SimpleAdapter {
    Context context;
    ArrayList<HashMap<String,String>>arrayList;
    LayoutInflater inflater;



    public SimpleCutomAdapter(Context context,  ArrayList<HashMap<String,String>>  data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
       this.context=context;
       this.arrayList=data;
       inflater.from(context);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= super.getView(position, convertView, parent);

        ImageView imageView = view.findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, arrayList.get(position).get("Name"), Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
