package com.example.lecture27alertdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alertbtn(View view) {
        AlertDialog.Builder  alertdb=new AlertDialog.Builder(this);
        alertdb.setTitle("Continue or exit ");
        alertdb.setIcon(R.drawable.ic_launcher_background);
        alertdb.setMessage("kya app  itni achi application band karna chaiengy ");
        alertdb.setCancelable(false);

        alertdb.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertdb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "ghalti hogayi", Toast.LENGTH_SHORT).show();
            }
        });
        alertdb.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "scene off hai ", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog  dialog  = alertdb.create();
        dialog.show();
    }
}