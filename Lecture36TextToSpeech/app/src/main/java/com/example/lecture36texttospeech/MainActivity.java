package com.example.lecture36texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText Text,Text1;
    Button btnText,btnText1;
    TextToSpeech textToSpeech ,tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.Text);
        Text1 = findViewById(R.id.Text1);
        btnText = findViewById(R.id.btnText);
        btnText1 = findViewById(R.id.btnText1);

        // create an object textToSpeech and adding features into it
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    textToSpeech.setLanguage(new Locale("ur"));
                }
            }
        });
        // create an object textToSpeech and adding features into it
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    tts.setLanguage(Locale.UK);
                }
            }
        });
        // Adding OnClickListener
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tts.speak(Text.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });



        btnText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(Text1.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}