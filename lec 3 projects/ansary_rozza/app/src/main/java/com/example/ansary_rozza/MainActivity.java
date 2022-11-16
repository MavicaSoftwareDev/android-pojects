package com.example.ansary_rozza;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.app.Fragment;
public class MainActivity extends AppCompatActivity {


    /**
     * 1. هاتلي المدير بتاع الفراجمنت ✔
     * 2. هاتلي الترانزكشن بتاعت النقل ✔
     * 3. الdisplayMetrics ✔
     * ناخد اوبجكت من الفراجمنت ✔
     * شغلي الترانزاكشن عشان تركب الفراجمنت علي الشاشه
     * @param savedInstanceState
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        // width > height -> bio fragment , width < height -> se fragment
        DisplayMetrics salahResolution = this.getResources().getDisplayMetrics();
        int width = salahResolution.widthPixels;
        int height = salahResolution.heightPixels;
        if(width>height){
            Fragment1 f1=new Fragment1();
            fragmentTransaction.replace(android.R.id.content,f1);
            fragmentTransaction.commit();
        }else{
            Fragment2 f2=new Fragment2();
            fragmentTransaction.replace(android.R.id.content,f2);
            fragmentTransaction.commit();
        }
    }
}