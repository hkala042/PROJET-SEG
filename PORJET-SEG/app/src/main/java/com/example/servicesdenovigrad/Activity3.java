package com.example.servicesdenovigrad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        back = (Button) findViewById(R.id.btn_back);
        back.setOnClickListener(View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}