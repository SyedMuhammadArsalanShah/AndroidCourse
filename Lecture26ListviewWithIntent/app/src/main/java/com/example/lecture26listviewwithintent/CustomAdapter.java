package com.example.lecture26listviewwithintent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class CustomAdapter extends BaseAdapter {
    Context context;
  ArrayList<Data> dataArrayList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Data> dataArrayList) {
        this.context = context;
        this.dataArrayList = dataArrayList;
    }
    @Override
    public int getCount() {
        return dataArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.listitem, null);

        TextView names = (TextView) view.findViewById(R.id.text);
        TextView disc = (TextView) view.findViewById(R.id.text1);

        names.setText(dataArrayList.get(position).getName());
        disc.setText(dataArrayList.get(position).getDes());



        return view;
    }
}
