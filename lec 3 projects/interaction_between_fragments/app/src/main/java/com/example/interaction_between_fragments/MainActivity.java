package com.example.interaction_between_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        b = (Button) findViewById(R.id.button_bioFragment_showContent);
        b.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv  = getActivity().findViewById(R.id.textView_seFragment_text);
                String text = tv.getText().toString();
            }
        });
        super.onStart();
    }
}