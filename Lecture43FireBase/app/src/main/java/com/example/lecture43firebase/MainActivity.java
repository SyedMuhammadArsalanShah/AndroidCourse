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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {


    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference reference;

    EditText name, email, pass, contact;
    TextInputLayout nametv, emailtv, passtv, contacttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              email = findViewById(R.id.email);
              pass = findViewById(R.id.pass);
              name = findViewById(R.id.name);
              contact = findViewById(R.id.contact);
              emailtv = findViewById(R.id.emailtv);
              passtv = findViewById(R.id.passtv);
              nametv = findViewById(R.id.nametv);
              contacttv = findViewById(R.id.contactv);

              auth = FirebaseAuth.getInstance();
              database = FirebaseDatabase.getInstance();
              reference = database.getReference("students");

    }


    public void signup(View view) {

        String mail = email.getText().toString();
        String pas = pass.getText().toString();

        String nam = name.getText().toString();
        String con = contact.getText().toString();


        if (nam.isEmpty()) {
            nametv.setError("Name required");
        } else if (mail.isEmpty()) {
            emailtv.setError("Email required");

        } else if (pas.isEmpty()) {
            passtv.setError("Pass required");
        } else if (con.isEmpty()) {
            contacttv.setError("Contact required");
        } else {

            reg(nam, mail, pas, con);


        }


    }

    private void reg(String nam, String mail, String pas, String con) {


        auth.createUserWithEmailAndPassword(mail, pas).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {

                    String key = auth.getCurrentUser().getUid();
                    Students students = new Students(nam, mail, pas, con);

                    reference.child(key).setValue(students).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {

                                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                                intent.putExtra("name", nam);
                                intent.putExtra("mail", mail);
                                intent.putExtra("pas", pas);
                                intent.putExtra("con", con);

                                startActivity(intent);


                            } else {
                                Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        }
                    });


                } else {

                    Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}