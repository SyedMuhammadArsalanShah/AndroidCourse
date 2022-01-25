package com.example.lecture28customalertdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alertbtn(View view) {
        Dialog dialog =new Dialog(this);
        dialog.setContentView(R.layout.item);
        Button button = dialog.findViewById(R.id.dbtn);
        text =dialog.findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url =text.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url));
                startActivity(intent);


                // dialog.dismiss();
                Toast.makeText( getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();

    }
}