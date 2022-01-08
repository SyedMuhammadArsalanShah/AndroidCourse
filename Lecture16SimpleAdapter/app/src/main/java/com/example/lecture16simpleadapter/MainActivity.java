package com.example.lecture16simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] fname={"Pakistan","Turkey","UAE","UK","Canada"};
    String [] fdesc={"This is our Pakistan"," This is our Turkey",
            " This is our UAE"," This is our UK", " This is our Canada"};


    int [] fimages={R.drawable.pakistan,R.drawable.turkey,
            R.drawable.unitedarabemirates,R.drawable.unitedkingdom,
            R.drawable.pakistan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.simplelistview);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<fname.length;i++){
            HashMap<String,String> hashMap =new HashMap<>();
            hashMap.put("Name",fname[i]);
            hashMap.put("Desc",fdesc[i]);
            hashMap.put("Images",fimages[i]+"");
            arrayList.add(hashMap);



        }
        String [] from= {"Name","Desc","Images" };
         int [] to={R.id.text,R.id.text1,R.id.image};


       SimpleAdapter obj = new SimpleAdapter(this,arrayList,R.layout.listitem,from,to);
       listView.setAdapter(obj);
    }

    public void li(View view) {



    }
}