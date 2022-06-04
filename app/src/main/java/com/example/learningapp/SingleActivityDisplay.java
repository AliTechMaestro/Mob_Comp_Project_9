package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SingleActivityDisplay extends AppCompatActivity {
    ImageView imgView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_display);

        Intent intent = getIntent();
        int imgId = intent.getIntExtra("ImgId",R.drawable.error);

        imgView = findViewById(R.id.img_Show);

        imgView.setImageResource(imgId);

        btn = findViewById(R.id.btn_prev);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleActivityDisplay.this, MainActivityListView.class);
                startActivity(intent);
            }
        });




    }
}