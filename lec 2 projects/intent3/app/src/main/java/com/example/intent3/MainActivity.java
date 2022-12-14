package com.example.intent3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView userName;
TextView password;
static  int LOGIN_REQUEST_CODE = 100;
static int REGISTER_REQUEST_CODE = 150;
String userNameText="user name : ";
String passwordText="password : ";
    Intent loginIntent;
    Intent registerIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=(TextView) findViewById(R.id.textView_userName);
        password=(TextView) findViewById(R.id.textView_password);
        loginIntent  = new Intent(this,LoginPageCode.class);
        registerIntent= new Intent(this,RegisterPageCode.class);
    }

    public void func_moveToLogin(View view){
        startActivityForResult(loginIntent,LOGIN_REQUEST_CODE);
    }

    public void func_moveToRegister(View view){
    startActivityForResult(registerIntent,REGISTER_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK ){
            Toast.makeText(this,"Result Ok",Toast.LENGTH_LONG).show();
            userName.setText("user name : "+data.getStringExtra("username"));
            password.setText("password : "+data.getStringExtra("password"));
        }else if(resultCode == RESULT_CANCELED){
            Toast.makeText(this,"Canceld",Toast.LENGTH_LONG).show();
            userName.setText("user name : "+data.getStringExtra("username"));
            password.setText("password : "+data.getStringExtra("password"));
        }
    }
}