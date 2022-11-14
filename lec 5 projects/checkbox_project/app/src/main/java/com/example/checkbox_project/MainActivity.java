package com.example.checkbox_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
RadioButton maleButton;
RadioButton femaleButton;
RadioGroup radioGroup;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        setTitle("Radio Buttons Project");
        maleButton=findViewById(R.id.radioButton_male);
        femaleButton=findViewById(R.id.radioButton_female);
        radioGroup=findViewById(R.id.radioGroupId);

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               if(i==R.id.radioButton_male){
                   textView.setText("Ansary is male ودا كدب");
               }else{
                   textView.setText("Ansary is female ودي الحقيقه");
               }
           }
       });

    }
}