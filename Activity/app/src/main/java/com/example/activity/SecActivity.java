package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity {

    Button but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        but1 = (Button) findViewById(R.id.button4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, SecActivity.class);
                startActivity(intent);
            }
        });
        but2 = (Button) findViewById(R.id.button3);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
