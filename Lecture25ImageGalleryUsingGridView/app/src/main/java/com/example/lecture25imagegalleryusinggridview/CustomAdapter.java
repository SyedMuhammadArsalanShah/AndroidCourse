package com.example.lecture25imagegalleryusinggridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class CustomAdapter extends BaseAdapter {
    Context context ;
    int name [];
    LayoutInflater inflater;
    public CustomAdapter(Context context, int [] name) {
        this.context = context;
        this.name = name;

        inflater=(LayoutInflater.from(context));
    }






    @Override
    public int getCount() {
        return name.length;
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

        view = inflater.inflate(R.layout.gridlist,null);
        ImageView imageView =view.findViewById(R.id.icon);
        imageView.setImageResource(name[position]);
        return view;
    }
}