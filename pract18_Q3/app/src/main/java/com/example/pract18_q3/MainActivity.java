package com.example.pract18_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    Button factbtn;
    EditText fact_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factbtn=findViewById(R.id.factbtn);
        fact_number=findViewById(R.id.fact_number);
        
        factbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String str = fact_number.getText().toString().trim();
                int num = Integer.parseInt(str);
                int res = 1 , i;
                for (i=2;i<=num;i++)
                    res *=i;
                String str1 = Integer.toString(res);
                Intent intent = new Intent(MainActivity.this, factorial_show.class);
                intent.putExtra("factorial_number",str1);
                startActivity(intent);
            }
        });
    }
}