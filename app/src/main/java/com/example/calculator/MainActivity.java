package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton b1,b2;
ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b1= findViewById(R.id.cal);
       b2= findViewById(R.id.age);
        c=findViewById(R.id.cl);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cal:
                Intent in = new Intent(MainActivity.this,Calculate.class);
                startActivity(in);
                break;
            case R.id.age:
                Intent in2 = new Intent(MainActivity.this,AgeCalculate.class);
                startActivity(in2);
                break;



        }


    }
}
