package com.example.lecture25imagegalleryusinggridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView1;
    int imagess[] = {
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView1 = findViewById(R.id.gridview1);

        CustomAdapter obj = new CustomAdapter(this,imagess);
        gridView1.setAdapter(obj);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int name = imagess[position];
                Intent detailIntent = new Intent(MainActivity.this, Detail.class);
                detailIntent.putExtra("name",name);
                startActivity(detailIntent);
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}