package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mod_learn,mod_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mod_learn = findViewById(R.id.mod_learn);
        mod_quiz = findViewById(R.id.mod_quiz);

        mod_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivityListView.class);
                startActivity(intent);
            }
        });

        mod_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityQuiz.class);
                startActivity(intent);
            }
        });

    }



}