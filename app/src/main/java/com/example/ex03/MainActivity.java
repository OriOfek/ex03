package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        i=0;
    }

    public void change(View view) {
        if (i<6)
        {
            btn.setText("This is a click number:"+""+i);
            i++;
        }
        else
        {
            btn.setText("Enough to click. Go to new start!");
            i=0;
        }
    }
}
