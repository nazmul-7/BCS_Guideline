package com.example.user.bcs_guideline.ExamPart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.bcs_guideline.HelperClass.DatabaseHelper;
import com.example.user.bcs_guideline.HelperClass.UserDetails;
import com.example.user.bcs_guideline.R;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Level2QuestionActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question,score;
    private int Score = 0 ;
    private int index = 1 ;
    DatabaseHelper databaseHelper;
    private Level2Question question = new Level2Question();
    private AlertDialog.Builder alertDialogBuilder;
    private String answer;
    private int questionLength = question.questions.length;
    protected List<String> remaining =new LinkedList<String>(Arrays.asList(question.questions));
    UserDetails userDetails;


    private int totoalQuestion=15;
    private String level="Level_2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_questions);

        databaseHelper = new DatabaseHelper(this);
        Intent intent = getIntent();
        userDetails = (UserDetails)intent.getSerializableExtra("MyClass");
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);
        score = findViewById(R.id.Score);


        tv_question =  findViewById(R.id.tv_question);


        score.setText(
                "Question No: "+index+
                        "\nScore out of "+totoalQuestion+"-> : 0 "
        );
        NextQuestion(nextRandom());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private int nextRandom() {

        //  Log.d("QuestionList", String.valueOf(remaining));

        int indexx = (int) (Math.random() * remaining.size());
        String questionTemp = remaining.get(indexx);
        // Log.d("TempQuestionList", questionTemp);
        remaining.remove( indexx);

        int ranInt =Arrays.asList(question.questions).indexOf(questionTemp);

        //Log.d("TempQuestionArray", question.questions[ranInt]);
        //Log.d("TempQuestionArrayIndex", String.valueOf(ranInt));
         Log.d("answer",question.getCorrectAnswer(ranInt));
        return ranInt;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        index++;
        if (index >= totoalQuestion + 1) {

            boolean flag = databaseHelper.UpdateScore(level, userDetails.getID(), Score);

            if (flag == true) {
                userDetails.setL2(Score);
            }
            Intent intent = new Intent(this, ExamActivity.class);
            intent.putExtra("MyClass", userDetails);
            startActivity(intent);
            finish();
        } else {
            switch (view.getId()) {
                case R.id.btn_one:
                    // Log.d("Choose ", (String) btn_one.getText());
                    // Log.d("Answer ", (String) answer);
                    if (btn_one.getText() == answer) {
                        Score++;
                        Toast.makeText(this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "You Are Wrong", Toast.LENGTH_SHORT).show();

                    }
                    break;
                case R.id.btn_two:
                    //  Log.d("Choose ", (String) btn_two.getText());
                    // Log.d("Answer ", (String) answer);
                    if (btn_two.getText() == answer) {
                        Score++;
                        Toast.makeText(this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    } else {
                        ;
                        Toast.makeText(this, "You Are Wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.btn_three:
                    //  Log.d("Choose ", (String) btn_three.getText());
                    //  Log.d("Answer ", (String) answer);
                    if (btn_three.getText() == answer) {
                        Score++;
                        Toast.makeText(this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "You Are Wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.btn_four:
                    //  Log.d("Choose ", (String) btn_four.getText());
                    //  Log.d("Answer ", (String) answer);
                    if (btn_four.getText() == answer) {
                        Score++;
                        Toast.makeText(this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "You Are Wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }

            NextQuestion(nextRandom());
            score.setText(
                    "Question No: " + index +
                            "\nScore out of " + totoalQuestion + "-> : " + Score + " "
            );
        }

    }

    private void Wrong(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Level2QuestionActivity.this);
        alertDialogBuilder
                .setMessage("Wrong")
                .setCancelable(false)
                .setPositiveButton("Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), Level2QuestionActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }

    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

}