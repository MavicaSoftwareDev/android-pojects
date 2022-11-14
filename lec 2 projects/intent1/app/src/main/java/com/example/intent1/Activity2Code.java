package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2Code extends AppCompatActivity {
Intent intent;
TextView userName;
TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_ui);
        intent = getIntent();
        userName = (TextView) findViewById(R.id.textView_userName);
        password = (TextView) findViewById(R.id.textView_password);
        String usern = intent.getStringExtra("username");
        String pass = intent.getStringExtra("password");
        userName.setText("user name : "+usern);
        password.setText("password : "+pass);
    }

    public void func_moveToHomePage(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}