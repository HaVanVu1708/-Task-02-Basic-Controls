package com.example.demologinjavamobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public  void Login(View view)
  {
      EditText etUserName = (EditText) findViewById(R.id.etUserName);
      EditText etPassWord = (EditText) findViewById(R.id.etPassWord);
      Log.i("Info", "Login Starting");
      Log.i("Username", etUserName.getText().toString());
      Log.i("PassWord", etPassWord.getText().toString());
  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}