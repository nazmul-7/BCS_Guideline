package com.example.user.bcs_guideline.ExamPart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.user.bcs_guideline.HelperClass.UserDetails;
import com.example.user.bcs_guideline.R;

public class ExamActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Level1Button, Level2Button, Level3Button ,Level4Button, Level5Button;
   // private Button Level4Button, Level5Button;
    UserDetails userDetails;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);



        Intent intent = getIntent();
        userDetails = (UserDetails)intent.getSerializableExtra("MyClass");
        Level1Button = findViewById(R.id.Level1Button);
        Level2Button = findViewById(R.id.Level2Button);
        Level3Button = findViewById(R.id.Level3Button);
        Level4Button = findViewById(R.id.Level4Button);
        Level5Button = findViewById(R.id.Level5Button);

        Log.d("UserDetails","ID = "+userDetails.getID()+
                "\n Username = "+userDetails.getUsername()+
                "\n Level 1 Score = "+userDetails.getL1()+
                "\n Level 2 Score = "+userDetails.getL2()+
                "\n Level 3 Score = "+userDetails.getL3()+
                "\n Level 4 Score = "+userDetails.getL4()+
                "\n Level 5 Score = "+userDetails.getL5());

        if(userDetails.getL1()<4){
            Level2Button.setEnabled(false);
            Level2Button.setText("Level 2(Locked)");
            Level2Button.setBackgroundColor(R.color.Level2_disable);
        }
        if(userDetails.getL2()<14){
            Level3Button.setEnabled(false);
            Level3Button.setText("Level 3(Locked)");
            Level3Button.setBackgroundColor(R.color.Level3_disable);
        }
if(userDetails.getL3()<14){
            Level4Button.setEnabled(false);
            Level4Button.setText("Level 4(Locked)");
            Level4Button.setBackgroundColor(R.color.Level3_disable);
        }
if(userDetails.getL4()<19){
            Level5Button.setEnabled(false);
            Level5Button.setText("Level 5(Locked)");
            Level5Button.setBackgroundColor(R.color.Level3_disable);
        }


        Level1Button.setOnClickListener(this);
        Level2Button.setOnClickListener(this);
        Level3Button.setOnClickListener(this);
        Level4Button.setOnClickListener(this);
        Level5Button.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Level1Button) {
            Intent intent = new Intent(ExamActivity.this, Level1QuestionActivity.class);
            intent.putExtra("MyClass",  userDetails);
            startActivity(intent);
            finish();


        }

        if (view.getId() == R.id.Level2Button) {
            Intent intent = new Intent(ExamActivity.this, Level2QuestionActivity.class);
            intent.putExtra("MyClass",  userDetails);
            startActivity(intent);
            finish();


        } if (view.getId() == R.id.Level3Button) {
            Intent intent = new Intent(ExamActivity.this, Level3QuestionActivity.class);
            intent.putExtra("MyClass",  userDetails);
            startActivity(intent);
            finish();


        }
        if (view.getId() == R.id.Level4Button) {
            Intent intent = new Intent(ExamActivity.this, Level4QuestionActivity.class);
            intent.putExtra("MyClass",  userDetails);
            startActivity(intent);
            finish();


        }
        if (view.getId() == R.id.Level5Button) {
            Intent intent = new Intent(ExamActivity.this, Level5QuestionActivity.class);
            intent.putExtra("MyClass",  userDetails);
            startActivity(intent);
            finish();


        }
    }
}


