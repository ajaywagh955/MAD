package com.example.pract18_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class factorial_show extends AppCompatActivity {

    TextView fact_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_show);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String value = bundle.getString("factorial_number");
            fact_num = findViewById(R.id.fact_num);
            fact_num.setText(value);


        }

    }
}