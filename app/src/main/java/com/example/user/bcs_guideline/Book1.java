package com.example.user.bcs_guideline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Book1 extends AppCompatActivity {



    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);

        final Bundle bundle = getIntent().getExtras();
        String button = bundle.getString("button");

        book1=(PDFView)findViewById(R.id.pdfBook1);

        if(button.equals("book1")) {
            Toast.makeText(this, "from Book1", Toast.LENGTH_SHORT).show();
            book1.fromAsset("preliminary_rule.pdf").load();
        }
        else if(button.equals("book2")) {
            book1.fromAsset("preliminary_28th.pdf").load();
        }
        else if(button.equals("book3")) {
            book1.fromAsset("preliminary_29th.pdf").load();
        }
        else if(button.equals("book4")) {
            book1.fromAsset("preliminary_30th.pdf").load();
        }
        else if(button.equals("book5")) {
            book1.fromAsset("preliminary_31st.pdf").load();
        }
        else if(button.equals("book6")) {
            book1.fromAsset("preliminary_32th.pdf").load();
        }
        else if(button.equals("book7")) {
            book1.fromAsset("preliminary_33th.pdf").load();
        }
        else if(button.equals("book8")) {
            book1.fromAsset("preliminary_34th.pdf").load();
        }
        else if(button.equals("book9")) {
            book1.fromAsset("preliminary_38th.pdf").load();
        }

    }
}