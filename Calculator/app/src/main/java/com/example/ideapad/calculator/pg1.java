package com.example.ideapad.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg1);
    }

    public void clickme(View view){
        Intent intent=new Intent(pg1.this,cal.class);
        startActivity(intent);
    }


}
