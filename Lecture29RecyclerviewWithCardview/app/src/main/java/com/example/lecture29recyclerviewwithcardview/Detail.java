package com.example.lecture29recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    ImageView imageView;
    TextView textView ,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView =findViewById(R.id.imageView2);
        textView =findViewById(R.id.textView3);
        textView2 =findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        String name =bundle.getString("name");
        String des =bundle.getString("des");
        int img =bundle.getInt("image");
        imageView.setImageResource(img);
        textView.setText(name);
        textView2.setText(des);
    }
}