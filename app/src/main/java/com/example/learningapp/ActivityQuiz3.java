package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityQuiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
    }
    public void moveForward(View v){
        Intent intent = new Intent(ActivityQuiz3.this,ActivityQuiz4.class);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(ActivityQuiz3.this,QuizActivity2.class);
        startActivity(intent);
    }

}