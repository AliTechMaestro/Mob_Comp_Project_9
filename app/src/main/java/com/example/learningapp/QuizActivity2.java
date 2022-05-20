package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
    }
    public void moveForward(View v){
        Intent intent = new Intent(QuizActivity2.this,ActivityQuiz3.class);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(QuizActivity2.this,ActivityQuiz.class);
        startActivity(intent);
    }


}