package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityQuiz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
    }
    public void moveForward(View v){
        Intent intent = new Intent(ActivityQuiz4.this,ActivityQuiz5.class);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(ActivityQuiz4.this,ActivityQuiz3.class);
        startActivity(intent);
    }
}