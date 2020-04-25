package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity implements View.OnClickListener {
EditText n1,n2;
TextView ans;
Button add,sub,mul,div,mod,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.subtract);
        mul=findViewById(R.id.multiply);
        mod=findViewById(R.id.mod);
        clear=findViewById(R.id.clear);
        div=findViewById(R.id.divide);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        mod.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String x,y;
        int num1,num2,answer;
switch (v.getId()){
    case R.id.add:
        x=n1.getText().toString();
        y=n2.getText().toString();
         num1=Integer.parseInt(x);
         num2=Integer.parseInt(y);
         answer=num1+num2;
        ans.setText(Integer.toString(answer));
        break;
    case R.id.subtract:
        x=n1.getText().toString();
        y=n2.getText().toString();
        num1=Integer.parseInt(x);
        num2=Integer.parseInt(y);
        answer=num1-num2;
        ans.setText(Integer.toString(answer));
        break;
    case R.id.multiply:
        x=n1.getText().toString();
        y=n2.getText().toString();
        num1=Integer.parseInt(x);
        num2=Integer.parseInt(y);
        answer=num1*num2;
        ans.setText(Integer.toString(answer));
        break;
    case R.id.divide:
        x=n1.getText().toString();
        y=n2.getText().toString();
        num1=Integer.parseInt(x);
        num2=Integer.parseInt(y);
      float answer1=(float)num1/num2;

        ans.setText(Double.toString(answer1));
        break;
    case R.id.mod:
        x=n1.getText().toString();
        y=n2.getText().toString();
        num1=Integer.parseInt(x);
        num2=Integer.parseInt(y);
        answer=num1%num2;
        ans.setText(Integer.toString(answer));
        break;
    case R.id.clear:
        n1.setText("");
        n2.setText("");
        ans.setText("");
        break;
}
}
}




