package com.example.a6week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mission8Custom extends AppCompatActivity {

    Button cmenuButton;
    Button cloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_custom);

        cmenuButton = findViewById(R.id.cmenuButton);
        cloginButton = findViewById(R.id.cloginButton);

        cmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8.class);
                startActivity(intent);
                finish();
            }
        });

        cloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}