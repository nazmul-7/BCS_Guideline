package com.example.user.bcs_guideline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Tab2Chat extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button book2,book3,book4,book5;

        View rootView = inflater.inflate(R.layout.tab2_chat, container, false);


        book2 = rootView.findViewById(R.id.bk2);
        book3 = rootView.findViewById(R.id.bk3);
        book4 = rootView.findViewById(R.id.bk4);
        book5 = rootView.findViewById(R.id.bk5);



        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book2");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book2.class);
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
                Intent intent = new Intent(getContext(), Book2.class);
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
                Intent intent = new Intent(getContext(), Book2.class);
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
                Intent intent = new Intent(getContext(), Book2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        return rootView;
    }
}
