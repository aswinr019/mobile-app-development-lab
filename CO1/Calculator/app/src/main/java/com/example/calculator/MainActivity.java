package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText number1 , number2, result;
    Button plus,minus,multiply,divide , res;
    Double value1 , value2 , output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        result = (EditText) findViewById(R.id.result);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(v);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub(v);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul(v);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div(v);
            }
        });
    }

    public void add(View view){
        value1 = Double.parseDouble(number1.getText().toString());
        value2 = Double.parseDouble(number2.getText().toString());
        output = value1 + value2;

        result.setText(Double.toString(output));
    }
    public void sub(View view){
        value1 = Double.parseDouble(number1.getText().toString());
        value2 = Double.parseDouble(number2.getText().toString());
        output = value1 - value2;
        result.setText(Double.toString(output));
    }
    public void mul(View view){
        value1 = Double.parseDouble(number1.getText().toString());
        value2 = Double.parseDouble(number2.getText().toString());
        output = value1 * value2;
        result.setText(Double.toString(output));
    }
    public void div(View view){
        value1 = Double.parseDouble(number1.getText().toString());
        value2 = Double.parseDouble(number2.getText().toString());
        output = value1 / value2;
        result.setText(Double.toString(output));
    }
}