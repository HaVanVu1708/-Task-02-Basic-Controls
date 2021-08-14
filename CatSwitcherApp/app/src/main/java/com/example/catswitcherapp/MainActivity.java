package com.example.catswitcherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

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
        Integer numImg = generateRandomIntIntRange(0,5);

        ImageView image = findViewById(R.id.catImageView);
        int[] images = new int[]{R.drawable.doraemon, R.drawable.doraemon1, R.drawable.doraemon2, R.drawable.doraemon3, R.drawable.doraemon4, R.drawable.doraemon5 };
        image.setImageResource(images[numImg]);

    }
    public static int generateRandomIntIntRange(int min, int max)
    {
        Random r = new Random();
        return  r.nextInt((max - min) + 1) + min;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}