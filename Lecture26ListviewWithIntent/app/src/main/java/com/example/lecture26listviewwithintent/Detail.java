package com.example.lecture26listviewwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {
TextView textView ,textView1;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView =findViewById(R.id.textV2);
        textView1 =findViewById(R.id.textV3);
        imageView =findViewById(R.id.imageView);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("key1");
        String desc=bundle.getString("key2");
        int img=bundle.getInt("key3");
        textView.setText(name);
        textView1.setText(desc);
        imageView.setImageResource(img);

    }
}