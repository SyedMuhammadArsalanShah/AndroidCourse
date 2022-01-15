package com.example.lecture21primaryclassesoffragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = findViewById(R.id.button);
         button2 = findViewById(R.id.button2);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               loadfragment(new F1());
             }
         });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfragment(new F2());


            }
        });

    }
    public void loadfragment(Fragment  hamza){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,hamza);
         transaction.commit();


    }






}