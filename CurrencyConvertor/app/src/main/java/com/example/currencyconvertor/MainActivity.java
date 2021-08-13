package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public void  currencyExchange(View view)
    {
        EditText flmonney = findViewById(R.id.etMonney);
        TextView textMonney = findViewById(R.id.txtView);

        double monney = Double.parseDouble(flmonney.getText().toString());
        double monney1 = monney * 22832.50;
        String monney2 = String.valueOf(monney1);

        textMonney.setText(monney2 + "VND");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}