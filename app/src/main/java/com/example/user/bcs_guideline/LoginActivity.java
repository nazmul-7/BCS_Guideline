package com.example.user.bcs_guideline;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.bcs_guideline.ExamPart.ExamActivity;
import com.example.user.bcs_guideline.HelperClass.DatabaseHelper;
import com.example.user.bcs_guideline.HelperClass.UserDetails;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button SignInButton, SignUpHereButton;
    private EditText usernameEditText;
    private EditText passwordEditText;
    DatabaseHelper databaseHelper;
    UserDetails userDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SignInButton = findViewById(R.id.SignInButtonId);
        SignUpHereButton = findViewById(R.id.SignUpHereButtonId);
        usernameEditText = findViewById(R.id.SignInusernameId);
        passwordEditText = findViewById(R.id.SignInpasswordId);

        databaseHelper = new DatabaseHelper(this);
        userDetails = new UserDetails();

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();
        SignInButton.setOnClickListener(this);
        SignUpHereButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();



        if (view.getId() == R.id.SignInButtonId) {

            if (username.equals("") || password.equals("")) {
                Toast.makeText(getApplicationContext(), "Username or Password incomplete", Toast.LENGTH_SHORT).show();
            } else {
                Boolean result = databaseHelper.findPassword(username, password);


                if(result==true)
                {
                    userDetails.setUsername(username);
                    userDetails.setPassword(password);
                    Cursor details = databaseHelper.GetFullDetails(username);


                    while (details.moveToNext()) {


                        userDetails.setID(details.getInt(0));
                        userDetails.setL1(details.getInt(3));
                        userDetails.setL2(details.getInt(4));
                        userDetails.setL3(details.getInt(5));
                        userDetails.setL4(details.getInt(6));
                        userDetails.setL5(details.getInt(7));
                    }







                    Intent intent = new Intent(LoginActivity.this, ExamActivity.class);
                    intent.putExtra("MyClass",  userDetails);
                    startActivity(intent);



                } else{

                    Toast.makeText(getApplicationContext(), "Username isn't exists,Please create a profile", Toast.LENGTH_LONG).show();

                }

            }


        }

          else if (view.getId() == R.id.SignUpHereButtonId)
            {

                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }


        }
    }



