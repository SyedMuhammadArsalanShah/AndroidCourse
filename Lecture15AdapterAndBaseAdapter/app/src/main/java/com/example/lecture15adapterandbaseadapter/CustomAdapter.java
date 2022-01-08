package com.example.lecture15adapterandbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class CustomAdapter extends BaseAdapter{
Context context ;
int images [];
 LayoutInflater inflater;
    public CustomAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;


         inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return images.length;
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

        view = inflater.inflate(R.layout.activity_gridlist,null);
        ImageView imageView =view.findViewById(R.id.icon);
        imageView.setImageResource(images[position]);

        return view;
    }
}