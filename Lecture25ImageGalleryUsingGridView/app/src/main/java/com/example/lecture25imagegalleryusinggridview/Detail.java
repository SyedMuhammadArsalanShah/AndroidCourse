package com.example.lecture25imagegalleryusinggridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    ImageView imageIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageIV=findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();
        int name=bundle.getInt("name");
        imageIV.setImageResource(name);
    }
}