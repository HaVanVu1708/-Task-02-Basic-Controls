package com.example.catswitcherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean iscat1 = true;

    public void switchCat(View view)
    {
        Log.i("Info", "Change pressed");

        ImageView image = findViewById(R.id.catImageView);
        if(iscat1)
        {
            image.setImageResource(R.drawable.cat2);
            iscat1 = false;
        }
        else
        {
            image.setImageResource(R.drawable.cat1);
            iscat1 = true;
        }
    }
    public void hotFace(View view)
    {

        ImageView image = findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.doraemon);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}