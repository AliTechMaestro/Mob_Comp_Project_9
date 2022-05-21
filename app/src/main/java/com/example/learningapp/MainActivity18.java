package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        textView = findViewById(R.id.score);
        Intent intent = getIntent();

        String score = String.valueOf(intent.getIntExtra("Score",0));
        textView.setText(score);
    }

    public void moveQuizMod(View v){
        Intent intent = new Intent(MainActivity18.this,ActivityQuiz.class);
        startActivity(intent);
    }
    public void moveHome(View v){
        Intent intent = new Intent(MainActivity18.this,MainActivity.class);
        startActivity(intent);
    }



}
