package com.example.lecture10datepickeranddatepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = findViewById(R.id.datePicker);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.change);

        textView.setText("Current  Date " + dateajayejohumchaien());
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              textView.setText("Change Date "+dateajayejohumchaien());
          }
      });

//
    }

//    public String dateconverter() {
//        StringBuilder obj = new StringBuilder();
//        obj.append((datePicker.getMonth() + 1) + "/");
//        obj.append(datePicker.getDayOfMonth() + "/");
//        obj.append(datePicker.getYear());
//        return obj.toString();
//
//
//    }

    public String dateajayejohumchaien() {
        StringBuilder obj=new StringBuilder();
        obj.append((datePicker.getMonth()+1)+"-");
        obj.append(datePicker.getDayOfMonth()+"-");
        obj.append(datePicker.getYear());
        return obj.toString();
    }
}