package com.example.lecture14textinputlayoutdesignlibraryguideline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView email,pass,contact,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);





        init();
        Bundle bundle = getIntent().getExtras();
        String studentname= bundle.getString("name");
        String Contactnumber= bundle.getString("cont");
        String password= bundle.getString("pass");
        String Emailaddress= bundle.getString("email");

        name.setText(studentname);
        contact.setText(Contactnumber);
        email.setText(Emailaddress);
        pass.setText(password);



    }
    public void init(){

        email= findViewById(R.id.email);
        name= findViewById(R.id.name);
        pass= findViewById(R.id.pass);
        contact= findViewById(R.id.contact);
  }





















}