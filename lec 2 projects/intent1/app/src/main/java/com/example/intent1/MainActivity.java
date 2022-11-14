package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.editText_userName);
        password = (EditText) findViewById(R.id.editText_password);
    }

    public void func_moveToSecondPage(View view){
      startActivity(new Intent("com.example.intent1.MainActivity"));
    }

//    public  void func_backToHomePage(View view){
//        startActivity(new Intent(this,MainActivity.class));
//    }

}
/**
 * 1. findViewById () -> link ui comp .
 * 2. setContentView() -> link ui with backend class .
 * 3. startActivity() -> take intent and navigate .
 * 4.intent.putExtra(Key,Value).
 * 5. getIntent() -> catch coming intent .
 * 6. intent.getStringExtra(Key).
 */