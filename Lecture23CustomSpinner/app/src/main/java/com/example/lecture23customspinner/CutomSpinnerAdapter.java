package com.example.lecture23customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class CutomSpinnerAdapter extends BaseAdapter {

    Context context;
    ArrayList<Data> dataArrayList = new ArrayList<>();

    public CutomSpinnerAdapter(Context context, ArrayList<Data> dataArrayList) {
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
        ImageView icon = (ImageView) view.findViewById(R.id.image);
        TextView names = (TextView) view.findViewById(R.id.text);
        icon.setImageResource(dataArrayList.get(position).getImagee());
        names.setText(dataArrayList.get(position).getName());

        return view;


    }
}
