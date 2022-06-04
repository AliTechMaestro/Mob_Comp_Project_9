package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Alphabets> {

    public MyAdapter(@NonNull Context context, @NonNull ArrayList<Alphabets> objects)
    {
        super(context,0 , objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Alphabets alphabets = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_learning_layout,parent,false);

        ImageView image = convertView.findViewById(R.id.img_View);

        image.setImageResource(alphabets.getImgId());


        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),SingleActivityDisplay.class);
                intent.putExtra("ImgId",alphabets.getImgId());
                getContext().startActivity(intent);
            }
        });

        return convertView;
    }

}
