package com.attrabit.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.attrabit.languageapp.canvas.WritingView;

public class DrawningActivity extends AppCompatActivity {
    WritingView writingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawning);
        writingView = findViewById(R.id.myView);
        writingView = new WritingView(this);
    }
}