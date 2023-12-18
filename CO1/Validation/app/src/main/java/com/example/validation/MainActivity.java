package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fullName , age , email , password;
    RadioButton male , female , other;
    CheckBox agree;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = (EditText) findViewById(R.id.fullnameinpt);
        age = (EditText) findViewById(R.id.ageinpt);
        email = (EditText) findViewById(R.id.emailinpt);
        password = (EditText) findViewById(R.id.paswdinpt);
        male = (RadioButton) findViewById(R.id.gndrmalerbtn);
        female = (RadioButton) findViewById(R.id.gndrfemalerbtn);
        other = (RadioButton) findViewById(R.id.gndrotherbtn);
        agree = (CheckBox) findViewById(R.id.agreecbox);
        register = (Button) findViewById(R.id.registerbtn);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerStudent(v);
            }
        });
    }

    public void registerStudent(View view){

        String fullNameVal = fullName.getText().toString().trim();
        String ageVal = age.getText().toString().trim();
        String emailVal = email.getText().toString().trim();
        String passwordVal = password.getText().toString().trim();

        if (validate(fullNameVal,ageVal,emailVal,passwordVal)){
            showSuccess("Registration successful!");
        }
    }

    public boolean validate(String fullNameVal , String ageVal , String emailVal , String passwordVal){

        boolean isValid = true;
        String errors = "";

        if( fullNameVal.isEmpty() ){
            isValid = false;
            errors += "Please enter the full name!\n";
        }
        if( ageVal.isEmpty() ){
            isValid = false;
            errors += "Please enter a valid age!\n";
        }
        else if ((Integer.parseInt(ageVal) < 18 )){
            isValid = false;
            errors += "Please enter a valid age!\n";
        }
        if(( !Patterns.EMAIL_ADDRESS.matcher(emailVal).matches())){
            isValid = false;
            errors += "Please enter a valid email address!\n";
        }
        if(( passwordVal.length() < 8 ) ){
            isValid = false;
            errors += "Please enter a valid password!\n";
        }
        if(!male.isChecked() && !female.isChecked() && !other.isChecked()){
            isValid = false;
            errors += "Please select a gender!\n";
        }
        if(!agree.isChecked()){
            isValid = false;
            errors += "Agree to the terms and conditions to register!";
        }

        if(!isValid){
            showErrors(errors);
        }


        return isValid;
    }

    public void showErrors(String errors){
        Toast.makeText(MainActivity.this,errors,Toast.LENGTH_LONG).show();
    }
    public void showSuccess(String message){
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
    }
}