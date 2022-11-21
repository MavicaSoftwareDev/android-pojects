package com.example.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton1){
                    Toast.makeText(MainActivity.this, "radio buttons 1 ", Toast.LENGTH_SHORT).show();
                }else if(i==R.id.radioButton2){
                    Toast.makeText(MainActivity.this, "radio buttons 2 ", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "radio buttons 3 ", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}