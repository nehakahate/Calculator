package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class AgeCalculate extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, View.OnClickListener
{
    Button bdate;
    TextView date,age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculate);
        bdate=findViewById(R.id.buttondate);
        //bage=findViewById(R.id.buttonage);

        date=findViewById(R.id.birthdate);
        age=findViewById(R.id.age);
        bdate.setOnClickListener(this);

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month+=1;
        date.setText(year+"/"+month+"/"+dayOfMonth);
        Calendar cn = Calendar.getInstance();
        int yn = cn.get(Calendar.YEAR);
        int yr=yn-year;
        age.setText(yr+" Years");

    }

    @Override
    public void onClick(View v) {
        Calendar cn = Calendar.getInstance();
        int d = cn.get(Calendar.DAY_OF_MONTH);
        int m = cn.get(Calendar.MONTH)+1;
        int y = cn.get(Calendar.YEAR);
        DatePickerDialog dp = new DatePickerDialog(this,this,y,m,d);
        dp.show();



    }
}
