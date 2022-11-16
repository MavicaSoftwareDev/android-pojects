package com.example.create_dynamic_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Fragment manager that used to manage all fragments inside the application .
         */
        FragmentManager fragmentManager = getFragmentManager();
        /**
         * fragment transaction that contain 3 fragments functions "add" , "remove" , "replace" .
         */
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        /**
         * display metrix class that used to get width and height of the screen .
         */
        DisplayMetrics resolution = this.getResources().getDisplayMetrics();
        /**
         * to get width of the screen
         */
        int screenWidth = resolution.widthPixels;
        /**
         * to get height of the screen .
         */
        int screenHeight = resolution.heightPixels;
        if(screenWidth<screenHeight){
            Fragment1 f1=new Fragment1();
            Toast.makeText(this, "width smaller than height", Toast.LENGTH_SHORT).show();
            fragmentTransaction.replace(android.R.id.content,f1);
        }else{
            Fragment2 f2=new Fragment2();
            Toast.makeText(this, "width larger than height", Toast.LENGTH_SHORT).show();

            fragmentTransaction.replace(android.R.id.content,f2);
        }
        fragmentTransaction.commit();

    }
}