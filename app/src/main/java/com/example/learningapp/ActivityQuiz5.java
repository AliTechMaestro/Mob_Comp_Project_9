package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityQuiz5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
    }

    public void movePrev(View v){
        Intent intent = new Intent(ActivityQuiz5.this,ActivityQuiz4.class);
        startActivity(intent);
    }
}