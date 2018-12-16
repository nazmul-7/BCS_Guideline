package com.example.user.bcs_guideline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        progressBar = (ProgressBar) findViewById(R.id.progressbarId);
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }

            private void startApp() {
                Intent intent = new Intent(SplashScreen.this,Home.class);
                startActivity(intent);
                finish();
            }

            private void doWork() {
                for (process = 20; process <= 100; process = process+20){
                    try {
                        Thread.sleep(1000);
                        progressBar.setProgress(process);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}
