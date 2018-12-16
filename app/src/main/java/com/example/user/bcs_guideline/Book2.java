package com.example.user.bcs_guideline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Book2 extends AppCompatActivity {



    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);


        final Bundle bundle = getIntent().getExtras();
        String button = bundle.getString("button");

        book2=(PDFView)findViewById(R.id.pdfBook2);


        if(button.equals("book1")) {
            Toast.makeText(this, "from Book1", Toast.LENGTH_SHORT).show();
            book2.fromAsset("writtenbook1.pdf").load();
        }
        else if(button.equals("book2")) {
            book2.fromAsset("writtenbook2.pdf").load();
        }
        else if(button.equals("book3")) {
            book2.fromAsset("bangladesh.pdf").load();
        }
        else if(button.equals("book4")) {
            book2.fromAsset("writtenbook3.pdf").load();
        }

        else if(button.equals("book5")) {
            book2.fromAsset("writtenbook1.pdf").load();
        }


    }
}
