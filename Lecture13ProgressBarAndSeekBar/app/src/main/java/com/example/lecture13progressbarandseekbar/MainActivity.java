package com.example.lecture13progressbarandseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar p1, p2;
    TextView textView;
    Button button;
    int i = 0;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = findViewById(R.id.progressBar);
        p2 = findViewById(R.id.progressBar2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = p2.getProgress();//initial
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (i < 100) {
                            i += 1;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    p2.setProgress(i);
                                    textView.setText(i + "/" + p2.getMax());
                               handler.postDelayed(new Runnable() {
                                   @Override
                                   public void run() {
                                       Intent intent = new Intent(MainActivity.this, SeekBarAndItsType.class);

                                       startActivity(intent);
                                   }
                               },5000);
                                }
                            });
                            try {
                                Thread.sleep(100);


                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }


                        }


                    }
                }).start();


            }
        });


    }
}