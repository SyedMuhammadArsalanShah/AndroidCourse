package com.example.lecture43firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

        TextView email;
        TextView pass;
        TextView namee;
        TextView conn;
        FirebaseAuth auth;
        Button button ,button1;
        EditText editText;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            init();
            button1 = findViewById(R.id.button5);
            editText = findViewById(R.id.name1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String url= editText.getText().toString();

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url));
                    startActivity(intent);

                }
            });

            Bundle bundle =getIntent().getExtras();
            String name =bundle.getString("name");
            String mail=bundle.getString("mail");
            String pas=bundle.getString("pas");
            String con=bundle.getString("con");

            email.setText(mail);
            pass.setText(pas);
            conn.setText(con);
            namee.setText(name);

        }

        private void init() {
            email =findViewById(R.id.email);
            pass =findViewById(R.id.pass);
            namee =findViewById(R.id.name);
            conn =findViewById(R.id.contact);
            auth = FirebaseAuth.getInstance();
        }

        public void rec(View view) {
            Intent intent =new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        }

        public void login(View view) {

            auth.signOut();
            Intent intent =new Intent(MainActivity2.this, Login.class);
            startActivity(intent);


        }









    }
