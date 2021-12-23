package com.example.lecture12splashscreen_analoganddigitalclockandratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ClockRate extends AppCompatActivity {
Button button;
TextView textView;
RatingBar rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_rate);
         button =findViewById(R.id.button3);
         textView =findViewById(R.id.textView);
         rate =  findViewById(R.id.ratingBar);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 textView.setText("your rating "+rate.getRating());
                 Toast.makeText(ClockRate.this, "Your Rating "+rate.getRating(), Toast.LENGTH_SHORT).show();

                        }
         });

        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textView.setText("your rating "+rate.getRating());
                Toast.makeText(ClockRate.this, "Your Rating "+rate.getRating(), Toast.LENGTH_SHORT).show();

            }
        });



    }
}