package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapterQuiz extends ArrayAdapter<Questions> {

    public MyAdapterQuiz(@NonNull Context context, @NonNull ArrayList<Questions> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Questions question = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_quiz_layout,parent,false);

        ImageView image = convertView.findViewById(R.id.guessImg);
        RadioButton r1 = convertView.findViewById(R.id.rb1);
        RadioButton r2 = convertView.findViewById(R.id.rb2);
        RadioButton r3 = convertView.findViewById(R.id.rb3);

        image.setImageResource(question.getImageId());
        r1.setText(question.getOp1());
        r2.setText(question.getOp2());
        r3.setText(question.getOp3());

        return convertView;

    }
}
