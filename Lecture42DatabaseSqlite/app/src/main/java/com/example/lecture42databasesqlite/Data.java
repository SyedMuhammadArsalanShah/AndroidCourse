package com.example.lecture42databasesqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class Data extends SQLiteOpenHelper {


    public Data(Context context) {
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Params.DB_TABLE + "("
                + Params.KEY_ID + " INTEGER PRIMARY KEY," + Params.KEY_NAME
                + " TEXT, " + Params.KEY_CONTACT + " TEXT" + ")";
        Log.d("Hamza", "Query being run is : "+ create);
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void addContact(Contact contact){
      SQLiteDatabase db  = this.getWritableDatabase();
      ContentValues values= new ContentValues();
      values.put(Params.KEY_NAME, contact.getName());
      values.put(Params.KEY_CONTACT,contact.getContact());


        db.insert(Params.DB_TABLE, null, values);
        Log.d("Hamza", "inserted ");
        db.close();

    }



    public List<Contact> getallrecords(){
        List<Contact> contactList =new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String select = "Select * from "+Params.DB_TABLE;

        Cursor cursor = db.rawQuery(select,null);
        if (cursor.moveToFirst())
        {
        do {
            Contact obj =new Contact();
            obj.setId(Integer.parseInt(cursor.getString(0)));
            obj.setName((cursor.getString(1)));
            obj.setContact((cursor.getString(2)));
            contactList.add( obj);


        }while (cursor.moveToNext());

        }
        return contactList;
    }

}
