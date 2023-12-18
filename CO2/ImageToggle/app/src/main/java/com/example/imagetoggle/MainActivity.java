package com.example.imagetoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1 , image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);

        image2.setVisibility(View.GONE);

        image1.setOnClickListener(this::clickHandler);
        image2.setOnClickListener(this::clickHandler);
    }

    protected void clickHandler(View view){
        if(view.getId() == R.id.image1){
            image1.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        }
        else if(view.getId() == R.id.image2){
         image1.setVisibility(View.VISIBLE);
         image2.setVisibility(View.GONE);
        }
    }
}