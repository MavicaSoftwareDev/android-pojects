package com.example.first_start_activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int settingPageRequestCode = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("main page");
    }

   public void navigateToSettingPage(View view){
       Intent i = new Intent(this,SettingPage.class);
       startActivityForResult(i,settingPageRequestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Toast.makeText(this, data.getStringExtra("username"), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, data.getStringExtra("username"), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show();

        }
         }
}