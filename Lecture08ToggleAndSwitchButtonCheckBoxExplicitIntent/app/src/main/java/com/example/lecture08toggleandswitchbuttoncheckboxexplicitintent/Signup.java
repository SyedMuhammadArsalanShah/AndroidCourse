package com.example.lecture08toggleandswitchbuttoncheckboxexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Signup extends AppCompatActivity {
    ToggleButton toggleButton;
    EditText name, email;
    Switch switchs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        toggleButton = findViewById(R.id.toggleButton);
        switchs = findViewById(R.id.switch1);
        name = findViewById(R.id.nameet);
        email = findViewById(R.id.emailet);

    }

    public void login(View view) {


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    public void ToggleButton(View view) {


        Toast.makeText(this, "selected gender is" + toggleButton.getText(), Toast.LENGTH_SHORT).show();


    }

    public void switchb(View view) {
        if (switchs.isChecked()) {
            Toast.makeText(this, "selected Session  is morning", Toast.LENGTH_LONG).show();
        } else {


            Toast.makeText(this, "selected Session  is evening", Toast.LENGTH_SHORT).show();
        }

    }

    public void reg(View view) {

        String namee = name.getText().toString();
        String emaill = email.getText().toString();
        Intent intent = new Intent(this, Profile.class);
        intent.putExtra("name", namee);
        intent.putExtra("email", emaill);
        startActivity(intent);

    }
}