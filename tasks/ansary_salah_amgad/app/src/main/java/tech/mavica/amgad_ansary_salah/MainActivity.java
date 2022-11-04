package tech.mavica.amgad_ansary_salah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        name = (TextView) findViewById(R.id.textview_name);
    }

    public void ansaryClicked(View view){
        name.setText("Lefta");
    }
    public void amgadClicked(View view){
        name.setText("Lobia");
    }

    public void salahClicked(View view){
        name.setText("me3za");
    }
}