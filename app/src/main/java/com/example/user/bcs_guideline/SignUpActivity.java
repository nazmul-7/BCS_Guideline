package com.example.user.bcs_guideline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.bcs_guideline.HelperClass.DatabaseHelper;
import com.example.user.bcs_guideline.HelperClass.UserDetails;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText cpasswordEditText;
    private Button SignUpButton;
    UserDetails userDetails;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SignUpButton = findViewById(R.id.SignUpButtonId);
        usernameEditText = findViewById(R.id.SignUpusernameId);
        passwordEditText = findViewById(R.id.SignUppasswordId);
        cpasswordEditText = findViewById(R.id.SignUppasswordIdconfirm);

        userDetails = new UserDetails();
        databaseHelper = new DatabaseHelper(this);

        SignUpButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String cpassword = cpasswordEditText.getText().toString();


        if(password.equalsIgnoreCase(cpassword)){
            userDetails.setUsername(username);
            userDetails.setPassword(password);

            long rowId = databaseHelper.insertData(username,password);

            if(rowId>0)
            {
                Toast.makeText(getApplicationContext(),"Row"+rowId+" is successfully inserted", Toast.LENGTH_LONG).show();
                finish();
            }else {

                Toast.makeText(getApplicationContext(),"Row inserted failed", Toast.LENGTH_LONG).show();
            }


        }
        else{
          //  Toast.makeText(getApplicationContext(),"Password Doesn't Match ",Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(),password+""+cpassword+" Doesn't Match ", Toast.LENGTH_LONG).show();
        }




    }
}
