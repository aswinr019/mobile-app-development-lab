package com.example.signinform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username , password;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals("test@testmail.com") &&(password.getText().toString().equals("test12345")))){
                    Toast.makeText(MainActivity.this, "Signin successfull",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid username/password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}