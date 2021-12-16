package com.example.lecture09intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    TextView emailtw, passtw;
    CheckBox burger, pizza, tea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailtw = findViewById(R.id.textView);
        passtw = findViewById(R.id.textView2);
        burger = findViewById(R.id.checkBox);
        pizza = findViewById(R.id.checkBox2);
        tea = findViewById(R.id.checkBox3);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("arsalan");
        String pass = bundle.getString("pass");
        emailtw.setText(email);
        passtw.setText(pass);


    }


    public void ord(View view) {
        StringBuilder result = new StringBuilder();
        int amount = 0;
        if (burger.isChecked()) {

            result.append("Burger Rs 500 ");
            amount += 500;
        }
        if (pizza.isChecked()) {

            result.append("\n Pizza Rs 1200 ");
            amount += 1200;
        }
        if (tea.isChecked()) {

            result.append("\n Tea Rs 35 ");
            amount += 35;
        }
        result.append("Total amount is " + amount);
        Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show();
    }

}