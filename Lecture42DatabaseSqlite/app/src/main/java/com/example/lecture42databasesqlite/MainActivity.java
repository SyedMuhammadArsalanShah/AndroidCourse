package com.example.lecture42databasesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Data db = new Data(MainActivity.this);

        // Creating a contact object for the db
        Contact contact = new Contact();
        contact.setContact("0312");
        contact.setName("Hamza Iqbal");

        // Adding a contact to the db
        db.addContact(contact);
        Contact contact3 = new Contact();
        contact3.setContact("0312");
        contact3.setName("Hamza 3Iqbal");

        // Adding a contact to the db
        db.addContact(contact3);
        Contact contact1 = new Contact();
        contact1.setContact("0312");
        contact1.setName("Daniyal");

        // Adding a contact to the db
        db.addContact(contact1);


        // work for select

        List<Contact> getallrecords = db.getallrecords();
        for(Contact con:getallrecords) {
                 Log.d("hamza" , "\n \n" +
                         " id "+con.getId()+
                          "\n Name "+con.getName()+
                         "\n Contact Number "+con.getContact());


        }

    }
}