package com.example.advancecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    boolean op = true;
    String operator = "+";
    String oldNumber = "";
    EditText number;

    String expr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        expr = "";
    }
        public void NumberEvent(View view) {
            if (op) {
                number.setText("");
            }
            op = false;
            String num = number.getText().toString();

            int viewId = view.getId();

            if (viewId == R.id.b1) {
                num += "1";
                expr += "1";

            } else if (viewId == R.id.b2) {
                num += "2";
                expr += "2";
            } else if (viewId == R.id.b3) {
                num += "3";
                expr += "3";
            } else if (viewId == R.id.b4) {
                num += "4";
                expr += "4";
            } else if (viewId == R.id.b5) {
                num += "5";
                expr += "5";
            } else if (viewId == R.id.b6) {
                num += "6";
                expr += "6";
            } else if (viewId == R.id.b7) {
                num += "7";
                expr += "7";
            } else if (viewId == R.id.b8) {
                num += "8";
                expr += "8";
            } else if (viewId == R.id.b9) {
                num += "9";
                expr += "9";
            } else if (viewId == R.id.b0) {
                num += "0";
                expr += "0";
            } else if (viewId == R.id.clr) {
                num = "";
                expr = "";
            }
            number.setText(num);
        }
        public void OperatorEvent(View view) {
            op = true;
            oldNumber = number.getText().toString();
            if (view.getId() == R.id.add) {
                operator = "+";
                expr += " + ";
            } else if (view.getId() == R.id.sub) {
                operator = "-";
                expr += " - ";
            } else if (view.getId() == R.id.mul) {
                operator = "*";
                expr += " x ";
            } else if (view.getId() == R.id.div) {
                operator = "/";
                expr += " / ";
            }
        }
        public void EqualEvent(View view){
            String newNumber = number.getText().toString();
            double res = 0.0;

            switch (operator) {

                case "+":
                    res = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                    break;
                case "-":
                    res = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                    break;
                case "*":
                    res = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                    break;
                case "/":
                    res = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                    break;
            }
            expr += " = ";
            expr += res;
            number.setText(expr);
        }

}