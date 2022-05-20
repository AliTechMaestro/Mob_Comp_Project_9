package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void moveForward(View v){
        Intent intent = new Intent(MainActivity10.this,MainActivity11.class);
        startActivity(intent);
    }

    public void movePrev(View v){
        Intent intent = new Intent(MainActivity10.this,MainActivity9.class);
        startActivity(intent);
    }

}