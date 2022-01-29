package com.example.lecture26listviewwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Data> arrayList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        arrayList.add(new Data("Pakistan", "Pakistan",R.drawable.ic_launcher_background));
        arrayList.add(new Data("Pakistan", "Pakistan1"));
        arrayList.add(new Data("Pakistan", "Pakistan2"));
        arrayList.add(new Data("Pakistan", "Pakistan3"));
        arrayList.add(new Data("Pakistan", "Pakista4"));
        arrayList.add(new Data("Pakistan", "Pakista5"));
        arrayList.add(new Data("Pakistan", "Pakistan6"));
        arrayList.add(new Data("Pakistan", "Pakistan7"));
        arrayList.add(new Data("Turkey", "Pakistan7"));
        arrayList.add(new Data("Canada", "Pakistan8"));
        arrayList.add(new Data("UAE", "Pakistan56"));
        arrayList.add(new Data("UK", "Pakistan66"));
        arrayList.add(new Data("Netherland", "Pakistan666"));

        CustomAdapter obj = new CustomAdapter(this, arrayList);

        listView.setAdapter(obj);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name, des;
                int image ;
                name = arrayList.get(i).getName();
                des = arrayList.get(i).getDes();
                image=arrayList.get(i).getImage();
                Intent detailIntent = new Intent(MainActivity.this, Detail.class);
                detailIntent.putExtra("name",name);
                detailIntent.putExtra("des",des);
                detailIntent.putExtra("img",image);
                startActivity(detailIntent);
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();

            }
        });
    }
}