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


        //update in db
         contact1.setId(27);
         contact1.setName("Daniyal Nasir");
         contact1.setContact("0307-1234567");


         //delete by id
        db.deleteRecordbyid(27);
        db.deleteRecordbyid(26);
        db.deleteRecordbyid(2);
        db.deleteRecordbyid(4);
        db.deleteRecordbyid(7);



        //delete by object

        contact1.getName();
        db.deleteRecord(contact1);







         int affected= db.updateRecord(contact1);
        Log.d("hamza", "kitni rows affected hoiyen "+affected);


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