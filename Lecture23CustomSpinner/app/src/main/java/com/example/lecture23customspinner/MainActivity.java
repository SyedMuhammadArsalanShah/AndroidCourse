package com.example.lecture23customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> arrayList = new ArrayList<>();
    Spinner spinner;
    ImageView imageView;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        arrayList.add(new Data("Pakistan", R.drawable.pakistan));
        arrayList.add(new Data("Turkey", R.drawable.turkey));
        arrayList.add(new Data("Canada", R.drawable.canada));
        arrayList.add(new Data("UAE", R.drawable.unitedarabemirates));
        arrayList.add(new Data("UK", R.drawable.unitedkingdom));
        arrayList.add(new Data("Netherland", R.drawable.netherlands));
        initList();
        imageView = findViewById(R.id.image);
        text = findViewById(R.id.text);
        CutomSpinnerAdapter  customAdapter=new CutomSpinnerAdapter(getApplicationContext(),arrayList);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String name = arrayList.get(position).getName();
                int image = arrayList.get(position).getImagee();
                text.setText(name);
                imageView.setImageResource(image);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void initList() {
        arrayList.add(new Data("Pakistan", R.drawable.pakistan));
        arrayList.add(new Data("Turkey", R.drawable.turkey));
        arrayList.add(new Data("Canada", R.drawable.canada));
        arrayList.add(new Data("UAE", R.drawable.unitedarabemirates));
        arrayList.add(new Data("UK", R.drawable.unitedkingdom));
        arrayList.add(new Data("Netherland", R.drawable.netherlands));
    }


}