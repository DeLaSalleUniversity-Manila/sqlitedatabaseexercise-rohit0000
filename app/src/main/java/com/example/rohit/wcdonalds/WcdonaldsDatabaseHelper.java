package com.example.rohit.wcdonalds;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Rohit on 10/20/2015.
 */
public class WcdonaldsDatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "wcdonalds"; //database name
    public static final int DB_VERSION = 1; // version

    WcdonaldsDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE FOOD ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT," + " DESCRIPTION TEXT,"
                + "IMAGE_ID INTEGER);");

        ContentValues foodValues = new ContentValues();
        foodValues.put("NAME,", "Big Mac");
        foodValues.put("DESCRIPTION", "Basicaly, two burgers stacked");
        foodValues.put("IMAGE_ID", R.mipmap.ic_launcher);

        db.insert("FOOD", null, foodValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}