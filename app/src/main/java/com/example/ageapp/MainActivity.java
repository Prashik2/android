package com.example.ageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
       final TextView tvAge = findViewById(R.id.tvAge);
       final TextView editTextYear = findViewById(R.id.editTextYear);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int age =currentYear-Integer.valueOf(editTextYear.getText().toString());
                tvAge.setText("Your Age is "+age);
               // tvAge.setText(String.format("Your age is %d", currentYear) -editTextYear.getText().toString().toInt());
            }
        });
    }


}