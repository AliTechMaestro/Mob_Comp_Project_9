package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity14 extends AppCompatActivity implements View.OnClickListener{

    CheckBox checkBoxHome,checkBoxOwl;

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        checkBoxHome = findViewById(R.id.checkBoxHen);
        checkBoxHome.setOnClickListener(this);
        checkBoxOwl = findViewById(R.id.checkBox_Owl);
        checkBoxOwl.setOnClickListener(this);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkBoxHen:
                if(checkBoxHome.isChecked()){
                    score = score+1;
                }
                break;
            case R.id.checkBox_Owl:
                if(checkBoxOwl.isChecked()){
                    score = score+1;
                }
                break;
        }
    }

    public void moveForward(View v){
        Intent intent = new Intent(MainActivity14.this,MainActivity15.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(MainActivity14.this,ActivityQuiz.class);

        startActivity(intent);
    }

}