package com.example.lecture14textinputlayoutdesignlibraryguideline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    EditText name,email,pass, contact;
    TextInputLayout nametv,emailtv,passtv,contacttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



    }

    public void init(){




        name =findViewById(R.id.name);
        email =findViewById(R.id.email);
        pass =findViewById(R.id.pass);
        contact =findViewById(R.id.contact);
        nametv =findViewById(R.id.nametv);
        emailtv =findViewById(R.id.emailtv);
        passtv =findViewById(R.id.passtv);
        contacttv =findViewById(R.id.contactv);

    }



    public void signup(View view) {

        String nam= name.getText().toString();
        String mail= email.getText().toString();
        String pas= pass.getText().toString();
        String con= contact.getText().toString();
        if(nam.isEmpty()){
            nametv.setError("name required");

        } else if(mail.isEmpty()){
            emailtv.setError("email  required");

        } else if(pas.isEmpty()){
            passtv.setError("password required");

        } else if(con.isEmpty()){
            contacttv.setError("contact required");

        }else{
        Intent intent =new Intent(this,Profile.class);
        intent.putExtra("name",nam);
        intent.putExtra("cont",con);
        intent.putExtra("pass",pas);
        intent.putExtra("email",mail);
        startActivity(intent);}

    }


}