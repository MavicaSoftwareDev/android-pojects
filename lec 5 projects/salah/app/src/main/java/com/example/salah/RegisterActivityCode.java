package com.example.salah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivityCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regsiter_activity_ui);
    }

    public void register(View view){
        /**
         * create intent
         * load data
         * setResult
         * finish
         */
        Intent i = new Intent();
        i.putExtra("username","amgad");
        i.putExtra("password","3ta3ta city");
        setResult(RESULT_OK,i);
        finish();

    }
}