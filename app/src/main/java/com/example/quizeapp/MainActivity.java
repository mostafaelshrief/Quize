package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEditText;
    RadioGroup mRadioBestClub, mRadioClubName;
    RadioButton r1, r4;
    CheckBox mCheckBox1, mCheckBox2, mCheckBox3;
    Button mButton;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        submit(mButton);
    }

    private void initviews() {
        mEditText = findViewById(R.id.namGK);
        mRadioBestClub = findViewById(R.id.best_club);
        mRadioClubName = findViewById(R.id.name_club);
        r1 = findViewById(R.id.radio_one);
        r4 = findViewById(R.id.club1);
        mCheckBox1 = findViewById(R.id.checkbox_one);
        mCheckBox2 = findViewById(R.id.checkbox_two);
        mCheckBox3 = findViewById(R.id.checkbox_three);
        mButton = findViewById(R.id.submit_btn);
        mButton.setOnClickListener(this);
    }

    private void checkQ1() {
        if (mEditText.getText().equals("neure")) score++;
    }

    private void checkQ2() {
        if (r1.isChecked()) score++;
    }

    private void checkQ3() {
        if (mCheckBox1.isChecked() && mCheckBox2.isChecked() && !mCheckBox3.isChecked()) score++;
    }

    private void checkQ4() {
        if (r4.isChecked()) score++;
    }

    public void submit(View view) {
        score = 0;
        checkQ1();
        checkQ2();
        checkQ3();
        checkQ4();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit_btn:
                Intent intent = new Intent(MainActivity.this, ViewResult.class);
                intent.putExtra("score", score);
                startActivity(intent);

                break;


        }
    }
}