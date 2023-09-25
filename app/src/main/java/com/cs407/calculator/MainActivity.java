package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        Double int1 = Double.parseDouble(integer1.getText().toString());
        Double int2 = Double.parseDouble(integer2.getText().toString());
        Double result = int1 + int2;
        goToActivity(Double.toString(result));
    }
    public void subtraction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        Double int1 = Double.parseDouble(integer1.getText().toString());
        Double int2 = Double.parseDouble(integer2.getText().toString());
        Double result = int1 - int2;
        goToActivity(Double.toString(result));
    }

    public void multiplication(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        Double int1 = Double.parseDouble(integer1.getText().toString());
        Double int2 = Double.parseDouble(integer2.getText().toString());
        Double result = int1 * int2;
        goToActivity(Double.toString(result));
    }

    public void division(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        Double int1 = Double.parseDouble(integer1.getText().toString());
        Double int2 = Double.parseDouble(integer2.getText().toString());
        Double result = int1 / int2;
        goToActivity(Double.toString(result));
    }
    public void goToActivity(String s){
        Intent intent=new Intent(this, Result.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
}