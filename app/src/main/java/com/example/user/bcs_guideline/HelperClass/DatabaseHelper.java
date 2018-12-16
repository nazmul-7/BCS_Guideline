package com.example.user.bcs_guideline.HelperClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "Candidate.db";
    private static final String TABLE_NAME = "CandidateDetails";
    private static final String USERNAME = "Username";
    private static final String PASSWORD = "Password";
    private static final String LEVEL_1 = "Level_1";
    private static final String LEVEL_2 = "Level_2";
    private static final String LEVEL_3 = "Level_3";
    private static final String LEVEL_4 = "Level_4";
    private static final String LEVEL_5 = "Level_5";
    private static final int VERSION_NUMBER = 4;
    private Context context;


    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(Id INTEGER PRIMARY KEY AUTOINCREMENT,"+USERNAME+" TEXT ,"+PASSWORD+" TEXT ,"+LEVEL_1+" INTEGER ,"+LEVEL_2+" INTEGER ,"+LEVEL_3+" INTEGER,"+LEVEL_4+" INTEGER,"+LEVEL_5+" INTEGER )";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " +TABLE_NAME;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
            Toast.makeText(context,"onCreate is called", Toast.LENGTH_LONG).show();

        }catch (Exception e){
            Log.d("Messages","Exception:  "+e);
            Log.d("Table","Query:  "+CREATE_TABLE);
            Toast.makeText(context,"Exception :"+e , Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


        try {

            Toast.makeText(context,"onUpgrade is called", Toast.LENGTH_LONG).show();

            sqLiteDatabase.execSQL(DROP_TABLE);

            onCreate(sqLiteDatabase);


        }catch (Exception e){
            Log.d("Messages","Exception:  "+e);
            Toast.makeText(context,"Exception :"+e , Toast.LENGTH_LONG).show();
        }

    }


    public long insertData(String username, String password)
    {

    SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(USERNAME,username);
        contentValues.put(PASSWORD,password);
        contentValues.put(LEVEL_1,0);
        contentValues.put(LEVEL_2,0);
        contentValues.put(LEVEL_3,0);
        contentValues.put(LEVEL_4,0);
        contentValues.put(LEVEL_5,0);

        long rowId =sqLiteDatabase.insert(TABLE_NAME,null,contentValues);

       return rowId;
    }

    public Boolean findPassword(String uname, String pass)
    {
 SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery ("Select * from " + TABLE_NAME + " where Username = '" + uname + "' and Password ='" + pass + "'",null);
        Boolean result = false;
        Log.d("Password Query","Select * from " + TABLE_NAME + " where Username = '" + uname + "' and Password ='" + pass + "'");

    if(cursor.getCount()>0){

        result = true;
    }
          return result;
    }

    public Cursor GetFullDetails(String username) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery (" SELECT * FROM "+TABLE_NAME+" where "+USERNAME+" = '"+username+"'",null);

        return cursor;

    }

    public Boolean UpdateScore(String col, int ID, int Score){
        Boolean flag = false;
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery (" SELECT "+col+" FROM "+TABLE_NAME+" where Id = "+ID,null);

        int temp=0;

        while(cursor.moveToNext()){
            temp = cursor.getInt(0);
        }
        Log.d("Compare","Target : "+Score+" > "+temp);
        if(Score>temp){
            flag = true;
            sqLiteDatabase.execSQL("update "+TABLE_NAME+" set "+col+"  = "+Score+" where Id = "+ID);

        }

        return flag;

    }
}




