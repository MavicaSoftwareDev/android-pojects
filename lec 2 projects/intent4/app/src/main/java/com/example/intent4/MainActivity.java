package com.example.intent4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button b ;
    TimePicker timePicker;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        timePicker= (TimePicker) findViewById(R.id.customTimePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hours, int minuts) {
                Toast.makeText(MainActivity.this, ""+hours+" : "+minuts, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showTime(View view) {
    int hours = timePicker.getCurrentHour();
    int minutes = timePicker.getCurrentMinute();
    Toast.makeText(this,""+hours, Toast.LENGTH_SHORT).show();
    }

}