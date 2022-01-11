package com.example.lecture15adapterandbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

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
    }
}