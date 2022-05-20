package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mod_learn,mod_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mod_learn = findViewById(R.id.mod_learn);
        mod_quiz = findViewById(R.id.mod_quiz);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod_learn.setOnClickListener(this);
        mod_quiz.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {




    }
}