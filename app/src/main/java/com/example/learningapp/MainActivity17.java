package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity17 extends AppCompatActivity implements View.OnClickListener{

    CheckBox checkBoxDog,checkBoxMonkey;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        checkBoxDog = findViewById(R.id.checkBox_Glass);
        checkBoxDog.setOnClickListener(this);
        checkBoxMonkey = findViewById(R.id.checkBoxMonkey);
        checkBoxMonkey.setOnClickListener(this);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);


    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkBox_Glass:
                if(checkBoxDog.isChecked()){
                    score++;
                }
                break;
            case R.id.checkBoxMonkey:
                if(checkBoxMonkey.isChecked()){
                    score++;
                }
                break;
        }
    }

    public void moveForward(View v){
        Intent intent = new Intent(MainActivity17.this,MainActivity18.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(MainActivity17.this,MainActivity16.class);
        startActivity(intent);
    }


}