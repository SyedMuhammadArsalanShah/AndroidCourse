package com.example.lecture11timepickeranaloganddigital;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
TimePicker timePicker;
TextView textView;
int hour,min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView =findViewById(R.id.text);
        timePicker =findViewById(R.id.timePicker);
        textView.setText("time is "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute());
        timePicker.setIs24HourView(false);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int min) {
                textView.setText("time is "+hour+":"+min);
            }
        });


    }
}