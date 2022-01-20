package com.example.lecture22spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView textView;
    Spinner spinner;
    String[] classes = {" ","Maryam", "Hamza","Zain", "Maaz", "Bilal", "Daniyal"};
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, classes);

        // set simple layout resource file
        // for each item of spinner
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // Toast.makeText(getApplicationContext(), classes[i]+"Maryam", Toast.LENGTH_SHORT).show();

        textView.setText(classes[i]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}