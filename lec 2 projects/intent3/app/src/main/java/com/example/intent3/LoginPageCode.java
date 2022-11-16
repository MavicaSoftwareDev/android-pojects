package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginPageCode extends AppCompatActivity {
EditText userName;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page_ui);
        userName = (EditText) findViewById(R.id.editText_userName);
        password = (EditText) findViewById(R.id.editText_password);
    }

    public void func_sendToHomePage(View view){
        Intent intent = new Intent();
        intent.putExtra("username",userName.getText().toString());
        intent.putExtra("password",password.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }

    public  void cancel(View view){
        Intent intent = new Intent();
        intent.putExtra("username","");
        intent.putExtra("password","");
        setResult(RESULT_CANCELED,intent);
        finish();
    }
}