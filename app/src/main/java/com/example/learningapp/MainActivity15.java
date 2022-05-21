package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity15 extends AppCompatActivity implements View.OnClickListener{

    CheckBox checkBoxHen,checkBoxGlass;

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        checkBoxHen = findViewById(R.id.checkBoxHen);
        checkBoxHen.setOnClickListener(this);
        checkBoxGlass = findViewById(R.id.checkBox_Glass);
        checkBoxGlass.setOnClickListener(this);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkBoxHen:
                if(checkBoxHen.isChecked()){
                    score = score+1;
                }
                break;
            case R.id.checkBox_Glass:
                if(checkBoxGlass.isChecked()){
                    score = score+1;
                }
                break;
        }
    }

    public void moveForward(View v){
        Intent intent = new Intent(MainActivity15.this,MainActivity16.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
    public void movePrev(View v){
        Intent intent = new Intent(MainActivity15.this,MainActivity14.class);
        startActivity(intent);
    }
}