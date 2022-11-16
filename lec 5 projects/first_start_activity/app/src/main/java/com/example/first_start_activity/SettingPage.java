package com.example.first_start_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SettingPage extends AppCompatActivity {
EditText username;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_page_ui);
        username=(EditText) findViewById(R.id.editText_settingPage_username);
        password=(EditText) findViewById(R.id.editText_settingPage_password);
    }
    public void save(View view){
        Intent i = new Intent();
        i.putExtra("username",username.getText().toString());
        i.putExtra("password",password.getText().toString());
        setResult(RESULT_OK,i);
        finish();
    }
}