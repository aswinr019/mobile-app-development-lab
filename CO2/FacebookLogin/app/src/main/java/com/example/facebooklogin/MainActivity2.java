package com.example.facebooklogin;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.facebooklogin.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    TextView msg;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msg = (TextView) findViewById(R.id.msg);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String email = extras.getString("email");
            msg.setText("Welcome"+email);
        }
    }

}