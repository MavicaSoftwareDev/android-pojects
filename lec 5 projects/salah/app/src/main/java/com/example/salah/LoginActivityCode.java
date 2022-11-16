package com.example.salah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivityCode extends AppCompatActivity {
EditText username;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_ui);
        username=findViewById(R.id.editText_loginPage_userName);
        password=findViewById(R.id.editText_loginPage_password);
    }

    public void save(View view){
        /**
         * 1. create intent ✔
         * 2. load data ✔
         * 3. setResult
         * 4. finsih
         */
        Intent i = new Intent();
        i.putExtra("username",username.getText().toString());
        i.putExtra("password",password.getText().toString());
        setResult(RESULT_OK,i); // result that you are waiting for
        finish(); // destroy UI .
    }
}