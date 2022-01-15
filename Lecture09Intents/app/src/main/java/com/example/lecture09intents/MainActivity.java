package com.example.lecture09intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.useret);
        pass = findViewById(R.id.passet);


    }

    public void submit(View view) {

        String emaill = email.getText().toString();
        String passs = pass.getText().toString();
        Intent intent = new Intent(this, Profile.class);
        intent.putExtra("arsalan", emaill);
        intent.putExtra("pass", passs);


        startActivity(intent);


    }

    public void ord(View view) {
        Intent intent = new Intent(this, ImplicitIntent.class);
        startActivity(intent);




    }
}