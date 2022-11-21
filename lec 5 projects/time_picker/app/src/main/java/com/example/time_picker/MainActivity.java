package com.example.time_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

TimePicker timePicker1;
TimePicker t2;
TimePicker t3;
    /**
     *
     */
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker1=findViewById(R.id.timePicker);
        int min = timePicker1.getCurrentHour();
        Toast.makeText(this, ""+min, Toast.LENGTH_SHORT).show();
        /**
         * setOnClickListener - normal buttons .
         * setOnCheckChangedListerner - true false button
         * setOnTimeChangedListener - timePicker
         */
              timePicker1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                  @Override
                  public void onTimeChanged(TimePicker timePicker, int hour, int minutes) {

                      Toast.makeText(MainActivity.this,""+min, Toast.LENGTH_SHORT).show();
//                      Toast.makeText(MainActivity.this, "hours : "+hour+" minutes : "+minutes, Toast.LENGTH_SHORT).show();
                  }
             });

    }

}