package com.example.user.bcs_guideline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab3online extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Button book1, book2,book3;

        View rootView = inflater.inflate(R.layout.tab3_online, container, false);

        book1 = rootView.findViewById(R.id.ck1);
        book2 = rootView.findViewById(R.id.ck2);
        book3 = rootView.findViewById(R.id.ck3);


        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("button", "book1");
                //Toast.makeText(getContext(), "Hello from Tab1contact", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Book3.class);
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
                Intent intent = new Intent(getContext(), Book3.class);
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
                Intent intent = new Intent(getContext(), Book3.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });




        return rootView;
    }
}
