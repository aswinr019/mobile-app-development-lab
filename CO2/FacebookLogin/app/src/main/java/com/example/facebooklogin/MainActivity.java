package com.example.facebooklogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailInpt , passwordInpt;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInpt = (EditText) findViewById(R.id.email);
        passwordInpt = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInpt.getText().toString().trim();
                String password = passwordInpt.getText().toString().trim();

                if(email.equals("test@testmail.com") && password.equals("test12345")){
                    redirect(email);
                }else{
                    Toast.makeText(MainActivity.this,"Incorrect credentials!",Toast.LENGTH_SHORT).show();;
                }
            }
        });
    }

    public void redirect(String email){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("email",email);
        startActivity(intent);
    }
}