package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void moveForward(View v){
        Intent intent = new Intent(MainActivity7.this,MainActivity8.class);
        startActivity(intent);
    }

    public void movePrev(View v){
        Intent intent = new Intent(MainActivity7.this,MainActivity6.class);
        startActivity(intent);
    }

}