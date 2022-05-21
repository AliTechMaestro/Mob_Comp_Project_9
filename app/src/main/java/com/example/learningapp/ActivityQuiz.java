package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ActivityQuiz extends AppCompatActivity implements View.OnClickListener{
    CheckBox checkBoxLion,checkBoxCat;
    int marks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        checkBoxLion = findViewById(R.id.checkBoxLion);
        checkBoxLion.setOnClickListener(this);
        checkBoxCat = findViewById(R.id.checkBoxCat);
        checkBoxCat.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.checkBoxCat:
                if(checkBoxCat.isChecked()){
                    marks = marks+1;
                }
                break;
            case R.id.checkBoxLion:
                if(checkBoxLion.isChecked()){
                    marks = marks+1;
                }
                break;
        }
    }

    public void moveForward(View v){
        Intent intent = new Intent(ActivityQuiz.this,MainActivity14.class);
        intent.putExtra("Score",marks);
        startActivity(intent);
    }






}