package com.example.peterleyva.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SeconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);

        if(getIntent().hasExtra("org.example.peterleyva")){
            TextView textView = (TextView) findViewById(R.id.secondTextview);
            String text = getIntent().getExtras().getString("org.example.peterleyva");
            textView.setText(text);
        }
    }
}
