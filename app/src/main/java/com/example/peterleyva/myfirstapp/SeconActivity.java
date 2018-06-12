package com.example.peterleyva.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button googleBtn = (Button) findViewById(R.id.goToGoogleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                Uri webadress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW , webadress);
                if(gotoGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoGoogle);
                }
            }
        });

    }
}
