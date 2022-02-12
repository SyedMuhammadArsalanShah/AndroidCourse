package com.example.lecture32sliderbyviewanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    Button next ,previous;
    ViewAnimator animator;
    int imagess[] = {
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.button);
        previous = findViewById(R.id.button2);
        animator = findViewById(R.id.viewAnimator);

        for (int i = 0; i < imagess.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imagess[i]);
            animator.addView(imageView);
        }
        //enter your input types
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);


        animator.setInAnimation(in);
        animator.setOutAnimation(out);
        animator.setAnimateFirstView(false);
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               animator.showNext();
           }
       });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator.showPrevious();
            }
        });
    }
}