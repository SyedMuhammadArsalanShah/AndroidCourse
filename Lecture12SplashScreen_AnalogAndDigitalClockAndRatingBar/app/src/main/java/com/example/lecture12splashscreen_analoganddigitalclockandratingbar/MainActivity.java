package com.example.lecture12splashscreen_analoganddigitalclockandratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void digital(View view) {
            Intent intent =new Intent(this,DigitalT.class);
            startActivity(intent);
        }
        public void analog(View view) {
            Intent intent =new Intent(this,AnalogT.class);
            startActivity(intent);
        }
    public void rate(View view) {
        Intent intent =new Intent(this, ClockRate.class);
        startActivity(intent);
    }

    }
