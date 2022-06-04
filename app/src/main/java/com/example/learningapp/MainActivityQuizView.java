package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityQuizView extends AppCompatActivity {

    ArrayList<Questions> al = new ArrayList<>();
    ListView list;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz_view);


        list = findViewById(R.id.ques_ListView);


        al.add(new Questions(R.drawable.lion,"Wolf","Lion","Dog","Lion"));
        al.add(new Questions(R.drawable.cat,"Cat","Parrot","Tiger","Cat"));
        al.add(new Questions(R.drawable.dog,"Monkey","Dog","House","Dog"));
        al.add(new Questions(R.drawable.home,"Home","Market","Sparrow","Home"));
        al.add(new Questions(R.drawable.monkey,"Man","Owl","Monkey","Monkey"));
        al.add(new Questions(R.drawable.owl,"Owl","Pigeon","Eagle","Owl"));
        al.add(new Questions(R.drawable.sparrow,"Animal","Sparrow","Duck","Sparrow"));
        al.add(new Questions(R.drawable.hen,"Hen","Duck","Peacock","Hen"));
        al.add(new Questions(R.drawable.glasses,"Mirror","Glasses","Umbrella","Glasses"));
        al.add(new Questions(R.drawable.orange,"Apple","Banana","Orange","Orange"));


        MyAdapterQuiz ad = new MyAdapterQuiz(this,al);
        list.setAdapter(ad);






    }
}