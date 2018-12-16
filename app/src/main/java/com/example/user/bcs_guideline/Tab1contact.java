package com.example.user.bcs_guideline;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Tab1contact  extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button book1, book2,book3,book4,book5,book6,book7,book8,book9;

        View rootView = inflater.inflate(R.layout.tab1_contact, container, false);

        book1 = rootView.findViewById(R.id.book1);
        book2 = rootView.findViewById(R.id.book2);
        book3 = rootView.findViewById(R.id.book3);
        book4 = rootView.findViewById(R.id.book4);
        book5 = rootView.findViewById(R.id.book5);
        book6 = rootView.findViewById(R.id.book6);
        book7 = rootView.findViewById(R.id.book7);
        book8 = rootView.findViewById(R.id.book8);
        book9 = rootView.findViewById(R.id.book9);


        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book1");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book2");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book3");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book4");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book5");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book6");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book7");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book8");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book9");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book1.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        return rootView;
    }
}