package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityQuizAnswer extends AppCompatActivity {

    public static int score = 0;
    TextView ans;

    RadioButton r1,r2,r3;
    ArrayList<Questions> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz_answer);

        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);
        r3 = findViewById(R.id.rb3);
        ans = findViewById(R.id.answer);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<al.size();i++){
                    if(r1.getText()==al.get(i).getCorrectAns()){
                        score+=1;
                    }
                }
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<al.size();i++){
                    if(r2.getText()==al.get(i).getCorrectAns()){
                        score+=1;
                    }
                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<al.size();i++){
                    if(r3.getText()==al.get(i).getCorrectAns()){
                        score+=1;
                    }
                }
            }
        });

        ans.setText(score);

    }
}