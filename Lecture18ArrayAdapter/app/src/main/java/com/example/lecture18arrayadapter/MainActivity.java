package com.example.lecture18arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    String [] name={"Pakistan","Turkey","UAE","UK","Canada"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,R.layout.list,R.id.text,name);
        listView.setAdapter(arrayAdapter);
    }
}