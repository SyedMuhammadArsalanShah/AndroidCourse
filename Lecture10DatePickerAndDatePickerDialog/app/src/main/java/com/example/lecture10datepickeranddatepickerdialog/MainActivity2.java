package com.example.lecture10datepickeranddatepickerdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    //private DatePicker datePicker;
    Calendar c;
    TextView dateView;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       dateView= (TextView) findViewById(R.id.textView);
        c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);

        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        datedikahnih(year, month + 1, day);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 showDialog(999);

            }
        });
    }

    private void datedikahnih(int year, int month, int day) {

        dateView.setText("Date"+year+"/"+month+"/"+day);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0, int y, int m, int d) {
                    // TODO Auto-generated method stub
                    // y= year
                    // m = month
                    // d = day
                    datedikahnih(y,  m+ 1, d);
                }
            };
}