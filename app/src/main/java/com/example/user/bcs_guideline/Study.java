package com.example.user.bcs_guideline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Study extends AppCompatActivity implements View.OnClickListener{

    private ImageView tourist,hotels,restaurent,hospital,university;
    private Intent intent;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        this.setTitle("BCS GUIDELINE");

        tourist = (ImageView) findViewById(R.id.touristPlace);
        hotels = (ImageView) findViewById(R.id.hotelPlace);
        restaurent = (ImageView) findViewById(R.id.restaurantPlace);
        hospital = (ImageView) findViewById(R.id.hospitalPlace);
        university = (ImageView) findViewById(R.id.universityPlace);


        Bundle bundle = getIntent().getExtras();
        value = bundle.getString("cityName");


        tourist.setOnClickListener(this);
        hotels.setOnClickListener(this);
        restaurent.setOnClickListener(this);
        hospital.setOnClickListener(this);
        university.setOnClickListener(this);


        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.touristPlace) {

            intent = new Intent(Study.this, Bangla_sahitto.class);
            intent.putExtra("cityName", value);
            startActivity(intent);
        }
        if (v.getId() == R.id.hotelPlace) {

            intent = new Intent(Study.this, English.class);
            intent.putExtra("cityName", value);
            startActivity(intent);
        }
        if (v.getId() == R.id.restaurantPlace) {

            intent = new Intent(Study.this, Bangladesh_bisoyaboli.class);
            intent.putExtra("cityName", value);
            startActivity(intent);
        }
        if (v.getId() == R.id.hospitalPlace) {

            intent = new Intent(Study.this, gonit.class);
            intent.putExtra("cityName", value);
            startActivity(intent);
        }
        if (v.getId() == R.id.universityPlace) {

            intent = new Intent(Study.this, Biggan.class);
            intent.putExtra("cityName", value);
            startActivity(intent);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
