package com.example.lecture19customarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Data> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview1);
        arrayList.add(new Data("Pakistan",R.drawable.pakistan));
        arrayList.add(new Data("Turkey", R.drawable.turkey));
        arrayList.add(new Data("Canada", R.drawable.canada));
        arrayList.add(new Data("UAE", R.drawable.unitedarabemirates));
        arrayList.add(new Data("UK", R.drawable.unitedkingdom));
        arrayList.add(new Data("Netherland", R.drawable.netherlands));
        ArrayAdapterCustomer obj = new ArrayAdapterCustomer(this,R.layout.gridview, arrayList);
        gridView.setAdapter(obj);


    }
}