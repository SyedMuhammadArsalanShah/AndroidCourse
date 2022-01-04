package com.example.lecture13progressbarandseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarAndItsType extends AppCompatActivity {
SeekBar s1,s2;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_and_its_type);
        s1 =findViewById(R.id.seekBar);
        s2 =findViewById(R.id.seekBar2);
        textView=findViewById(R.id.textView2);
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            int seek=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
             seek = i  ;
            //textView.setText(String.valueOf(seek));
           //  Toast.makeText(SeekBarAndItsType.this,"this is our seekbar value"+seek, Toast.LENGTH_SHORT).show();

            };


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               //  textView.setText(String.valueOf(seek));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
              textView.setText(String.valueOf(seek));
            }
        });






    }
}