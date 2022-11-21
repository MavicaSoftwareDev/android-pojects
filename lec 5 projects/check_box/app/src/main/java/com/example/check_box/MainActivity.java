package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox c1;
    CheckBox c2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkbox1);
        c2=findViewById(R.id.checkbox2);
        /**
         * normal button : setOnClickListener
         * true false button : setOnCheckChangedListener
         */
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            /**
             * onClick(View view)
             */
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b==true){
                Toast.makeText(MainActivity.this, "Ansary Female True", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Ansary Female False", Toast.LENGTH_SHORT).show();
            }
            }
        });

        /**
         * Listener for secod button
         */
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            /**
             * onClick
             */
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){
                    Toast.makeText(MainActivity.this, "Ansary Gay True", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Ansary Gay false", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}