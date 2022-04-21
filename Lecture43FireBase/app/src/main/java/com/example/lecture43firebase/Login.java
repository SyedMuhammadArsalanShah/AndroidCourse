package com.example.lecture43firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {


        EditText email,pass;
        TextInputLayout emailtv,passtv;
        FirebaseAuth auth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        if (auth.getCurrentUser() != null){
            Intent intent =new Intent(this,Home.class);
            startActivity(intent);

        }


    }


        private void init() {
        email =findViewById(R.id.email);
        pass =findViewById(R.id.pass);
        emailtv =findViewById(R.id.emailtv);
        passtv =findViewById(R.id.passtv);
        //
        auth= FirebaseAuth.getInstance();

    }


        public void login(View view) {
        String mail= email.getText().toString();
        String pas= pass.getText().toString();

        if(mail.isEmpty()){
            emailtv.setError("Email required");

        }else if(pas.isEmpty()){
            passtv.setError("Pass required");

        }else{

            loginn(mail,pas);


        }

    }

        private void loginn(String mail, String pas) {
        auth.signInWithEmailAndPassword(mail,pas).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Intent intent =new Intent(Login.this,Home.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

        public void signup(View view) {
        Intent intent =new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
    }



