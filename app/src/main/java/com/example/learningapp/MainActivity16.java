package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity16 extends AppCompatActivity implements View.OnClickListener{

    CheckBox checkBoxOrange,checkBoxSparrow;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        checkBoxOrange = findViewById(R.id.checkBoxOrange);
        checkBoxOrange.setOnClickListener(this);
        checkBoxSparrow = findViewById(R.id.checkBoxSparrow);
        checkBoxSparrow.setOnClickListener(this);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);


    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkBoxOrange:
                if(checkBoxOrange.isChecked()){
                    score++;
                }
                break;
            case R.id.checkBoxSparrow:
                if(checkBoxSparrow.isChecked()){
                    score++;
                }
                break;
        }
    }

    public void moveForward(View v){
        Intent intent = new Intent(MainActivity16.this,MainActivity17.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(MainActivity16.this,MainActivity15.class);
        startActivity(intent);
    }


}