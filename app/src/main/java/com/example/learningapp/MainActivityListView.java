package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityListView extends AppCompatActivity {

    ListView list;
    ArrayList<Alphabets> al = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        list = findViewById(R.id.ques_ListView);


        al.add(new Alphabets(R.drawable.a));
        al.add(new Alphabets(R.drawable.b));
        al.add(new Alphabets(R.drawable.c));
        al.add(new Alphabets(R.drawable.d));
        al.add(new Alphabets(R.drawable.e));
        al.add(new Alphabets(R.drawable.f));
        al.add(new Alphabets(R.drawable.g));
        al.add(new Alphabets(R.drawable.h));
        al.add(new Alphabets(R.drawable.i));
        al.add(new Alphabets(R.drawable.j));
        al.add(new Alphabets(R.drawable.k));
        al.add(new Alphabets(R.drawable.l));
        al.add(new Alphabets(R.drawable.m));
        al.add(new Alphabets(R.drawable.n));
        al.add(new Alphabets(R.drawable.o));
        al.add(new Alphabets(R.drawable.p));
        al.add(new Alphabets(R.drawable.q));
        al.add(new Alphabets(R.drawable.r));
        al.add(new Alphabets(R.drawable.s));
        al.add(new Alphabets(R.drawable.t));
        al.add(new Alphabets(R.drawable.u));
        al.add(new Alphabets(R.drawable.v));
        al.add(new Alphabets(R.drawable.w));
        al.add(new Alphabets(R.drawable.x));
        al.add(new Alphabets(R.drawable.y));
        al.add(new Alphabets(R.drawable.z));

        MyAdapter adapter = new MyAdapter(this,al);
        list.setAdapter(adapter);

    }
}