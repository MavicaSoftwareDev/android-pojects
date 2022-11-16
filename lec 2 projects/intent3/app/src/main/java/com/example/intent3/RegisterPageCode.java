package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterPageCode extends AppCompatActivity {
EditText editText_username;
EditText editText_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page_ui);
        editText_username=(EditText) findViewById(R.id.edtiText_register_userName);
        editText_password=(EditText) findViewById(R.id.editText_register_password);
    }

    public void sendBackToHomeFromRegister(View view){
        Intent intent = new Intent();
//        intent.setData(Uri.parse(editText_username.getText().toString()));
//        intent.setData(Uri.parse(editText_password.getText().toString()));
        intent.putExtra("username",editText_username.getText().toString());
        intent.putExtra("password",editText_password.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}