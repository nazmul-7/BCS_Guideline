package com.example.user.bcs_guideline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Bangla_sahitto extends AppCompatActivity {

    private ListView listView;
    String[] touristPlaces;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_sahitto);
        this.setTitle("Bangla sahitto");

        listView = (ListView) findViewById(R.id.listViewId);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("cityName");

        if (value.equalsIgnoreCase("sylhet")) {
            touristPlaces = getResources().getStringArray(R.array.sylhet_tourist_place);


        }

        adapter = new ArrayAdapter<String>(this, R.layout.bangla_sahitto_sample, R.id.touristTextViewId, touristPlaces);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = adapter.getItem(i);
                Intent intent = new Intent(Bangla_sahitto.this,Bangla_Sahitto_Description.class);
                intent.putExtra("name",value);
                startActivity(intent);
                // Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

            }
        });

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        MenuItem menuItem =menu.findItem(R.id.searchViewId);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
