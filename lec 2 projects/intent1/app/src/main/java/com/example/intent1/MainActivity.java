package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func_moveToSecondPage(View view){
       Intent i = new Intent(this,Activity2Code.class);
       startActivity(i);
    }


}

/**
 * 1. findViewById () -> link ui comp
 * 2. setContentView() -> link ui with backend class .
 * 3. startActivity() -> take intent and navigate .
 */