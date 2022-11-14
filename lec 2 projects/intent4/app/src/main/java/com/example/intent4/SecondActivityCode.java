package com.example.intent4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivityCode extends AppCompatActivity {
String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_ui);
        Intent i = getIntent();
        Toast.makeText(this,i.getData().toString(), Toast.LENGTH_LONG).show();
    }

    public void backToMain(View view){
        Intent i = new Intent();
        setResult(RESULT_OK,i);
        finish();
    }
}