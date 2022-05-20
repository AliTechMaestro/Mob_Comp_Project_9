package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void moveForward(View v){
        Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
        startActivity(intent);
    }

    public void movePrev(View v){
        Intent intent = new Intent(MainActivity6.this,MainActivity5.class);
        startActivity(intent);
    }

}