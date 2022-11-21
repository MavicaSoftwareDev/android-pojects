package com.example.toggle_button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import com.google.android.material.checkbox.MaterialCheckBox;

public class MainActivity extends AppCompatActivity {
ToggleButton tb;
Button btn;
ImageButton ib;
CheckBox c;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=findViewById(R.id.toggleButton);

        /**
         * Toggle Button listner
         */
        tb.setOnCheckedChangeListener(new ToggleButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });
        /**
         * Button listener
         */
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){

                    }
                }
        );

        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckChanged(){

            }
        });
    }

}