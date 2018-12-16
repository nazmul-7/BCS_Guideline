package com.example.user.bcs_guideline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Book3 extends AppCompatActivity {



    PDFView book3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);


        final Bundle bundle = getIntent().getExtras();
        String button = bundle.getString("button");

        book3=(PDFView)findViewById(R.id.pdfBook3);


        if(button.equals("book1")) {
            Toast.makeText(this, "from Book1", Toast.LENGTH_SHORT).show();
            book3.fromAsset("tips1.pdf").load();
        }
        else if(button.equals("book2")) {
            book3.fromAsset("tips2.pdf").load();
        }
        else if(button.equals("book3")) {
            book3.fromAsset("tips3.pdf").load();
        }



    }
}
