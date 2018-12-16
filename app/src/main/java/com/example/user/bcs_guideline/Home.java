package com.example.user.bcs_guideline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button Study,Modeltest,Books,VivaResourced,Groupchat,Syllabus,PreviousQuestion,Guideline;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("BCS GUIDELINE");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Study = (Button) findViewById(R.id.SylhetButtonId);
        Modeltest = (Button) findViewById(R.id.DhakaButtonId);
        Books = (Button) findViewById(R.id.KhulnaButtonId);
        VivaResourced = (Button) findViewById(R.id.MymensinghButtonId);
        Groupchat = (Button) findViewById(R.id.RajshahiButtonId);
        Syllabus = (Button) findViewById(R.id.RangpurButtonId);
        PreviousQuestion = (Button) findViewById(R.id.BarisalButtonId);
        Guideline = (Button) findViewById(R.id.ChittagongButtonId);

        Study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","sylhet");
                startActivity(intent);
            }
        });
        Modeltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.LoginActivity.class);
                intent.putExtra("cityName","dhaka");
                startActivity(intent);
            }
        });
        Books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Tab.class);
                intent.putExtra("cityName","khulna");
                startActivity(intent);
            }
        });
       /* VivaResourced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","mymensingh");
                startActivity(intent);
            }
        });
        Groupchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","rajshahi");
                startActivity(intent);
            }
        });
        Syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","rangpur");
                startActivity(intent);
            }
        });
        PreviousQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","barisal");
                startActivity(intent);
            }
        });
        Guideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, com.example.user.bcs_guideline.Study.class);
                intent.putExtra("cityName","chittagong");
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(Home.this,About.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_HomeId) {
            Intent intent = new Intent(Home.this,Home.class);
            startActivity(intent);
            finish();
        }
        else if (id == R.id.nav_AboutDeveloperId) {
            Intent intent = new Intent(Home.this,AboutDeveloper.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_ShareId) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareSubject = "BCS Guideline apps";
            String shareBody = "This helps is very using to preparation in Bcs examination";
            intent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);
            intent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(intent,"Share With"));
        }
        else if (id == R.id.nav_RefaranceId) {
            Intent intent = new Intent(Home.this, Refarance.class);
            startActivity(intent);

        }
        /*else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
