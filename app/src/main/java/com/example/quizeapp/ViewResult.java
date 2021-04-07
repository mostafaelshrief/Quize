package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewResult extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_result);
        initviews();
    }

    private void initviews() {
        mTextView = findViewById(R.id.score_result);
        reciveData();
    }

    private void reciveData() {
        Intent intent = getIntent();
        mTextView.setText(intent.getStringExtra("score"));

    }
}