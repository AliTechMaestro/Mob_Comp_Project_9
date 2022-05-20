package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLearning extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
    }

    public void moveForward(View v){
        Intent intent = new Intent(ActivityLearning.this,MainActivity2.class);
        startActivity(intent);
    }

    public void movePrev(View v){
        Intent intent = new Intent(ActivityLearning.this,MainActivity.class);
        startActivity(intent);
    }


}