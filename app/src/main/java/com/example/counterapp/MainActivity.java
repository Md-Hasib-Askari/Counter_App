package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton toastBtn, resetBtn, countUpBtn;
    private TextView showNumber;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn = (AppCompatButton) findViewById(R.id.toastBtn);
        resetBtn = (AppCompatButton) findViewById(R.id.resetBtn);
        countUpBtn = (AppCompatButton) findViewById(R.id.countUpBtn);
        showNumber = (TextView) findViewById(R.id.showNumber);

//      =============================================================
        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Number is " + count, Toast.LENGTH_SHORT).show();
            }
        });

//      =============================================================
        countUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                showNumber.setText(count.toString());
            }
        });
//      =============================================================
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                showNumber.setText(count.toString());
            }
        });

//      =============================================================

    }
}