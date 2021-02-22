package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button act_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act_button = findViewById(R.id.act_button);
    }

    public void switch_activities(View view){
        Intent act_action = new Intent(packageContext this, Activity2.class);
        startActivity(act_action);
    }
}