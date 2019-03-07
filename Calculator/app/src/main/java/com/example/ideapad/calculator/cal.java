package com.example.ideapad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cal extends AppCompatActivity {

    EditText num1 , num2;
    TextView tv1;
    Button add,sub,mul,div,modu,pow,log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        tv1 = findViewById(R.id.tv1);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        modu = findViewById(R.id.modu);
        pow = findViewById(R.id.pow);
        log = findViewById(R.id.log);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a+b;
                tv1.setText(Integer.toString(c));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a-b;
                tv1.setText(Integer.toString(c));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a*b;
                tv1.setText(Integer.toString(c));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a/b;
                tv1.setText(Integer.toString(c));

            }
        });


        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a=Integer.parseInt(num1.getText().toString());
                double b=Integer.parseInt(num2.getText().toString());
                double c=Math.pow(a,b);
                tv1.setText(Double.toString(c));

            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a=Integer.parseInt(num1.getText().toString());
                double b=Integer.parseInt(num2.getText().toString());
                double c=Math.log(a)+Math.log(b);
                tv1.setText(Double.toString(c));

            }
        });


    }
}
