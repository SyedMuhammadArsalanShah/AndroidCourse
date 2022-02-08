package com.example.lecture30calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bequal,badd,bsub,bmul,bdiv;
    EditText editText;
    double first ,second,res;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =findViewById(R.id.button);
        b2 =findViewById(R.id.button2);
        b3 =findViewById(R.id.button3);
        b4 =findViewById(R.id.button4);
        b5 =findViewById(R.id.button5);
        b6 =findViewById(R.id.button6);
        b7 =findViewById(R.id.button7);
        b8 =findViewById(R.id.button8);
        b9 =findViewById(R.id.button9);
        b0 =findViewById(R.id.button0);
        bdot =findViewById(R.id.buttondot);
        bequal =findViewById(R.id.buttonequal);
        badd=findViewById(R.id.addbtn);
        bsub =findViewById(R.id.subbtn);
        bmul =findViewById(R.id.multiplybtn);
        bdiv =findViewById(R.id.dividebtn);
        editText= findViewById(R.id.edittext);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second =Double.parseDouble(editText.getText().toString());

                if(value.equals("+")){
                    res= first+second;
                    editText.setText(Double.toString(res));
                }
                else if(value.equals("/")){
                    res= first/second;
                    editText.setText(Double.toString(res));
                }
                else if(value.equals("-")){
                    res= first-second;
                    editText.setText(Double.toString(res));
                }
                else if(value.equals("*")){
                    res= first*second;
                    editText.setText(Double.toString(res));
                }



            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first =Double.parseDouble(editText.getText().toString());
                value="+";
                editText.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first =Double.parseDouble(editText.getText().toString());
                value="*";
                editText.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first =Double.parseDouble(editText.getText().toString());
                value="-";
                editText.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first =Double.parseDouble(editText.getText().toString());
                value="/";
                editText.setText(null);
            }
        });
    }
}