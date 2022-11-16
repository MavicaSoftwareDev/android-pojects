package com.example.salah;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView username ;
TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.textView_mainPage_username);
        password = findViewById(R.id.textView_mainPage_password);

    }

    public void goToLoginPage(View view){
    startActivityForResult(new Intent(this,LoginActivityCode.class),50);
    }

    public  void goToRegisterPage(View view){
        startActivityForResult(new Intent(this,RegisterActivityCode.class),100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==50){
            Toast.makeText(this, "data from login", Toast.LENGTH_SHORT).show();
            username.setText("user name : "+data.getStringExtra("username"));
            password.setText("password : "+data.getStringExtra("password"));

        }else{
            Toast.makeText(this, "data from register", Toast.LENGTH_SHORT).show();
            username.setText("user name : "+data.getStringExtra("username"));
            password.setText("password : "+data.getStringExtra("password"));

        }
        }
}

/**
 * 1. startActivityForResult -> navigate + send requestCode .
 */