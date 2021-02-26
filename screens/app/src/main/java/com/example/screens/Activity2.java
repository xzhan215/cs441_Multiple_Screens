package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;

public class Activity2 extends AppCompatActivity {
    public  String input_text;
    EditText edit_Text;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        edit_Text = (EditText)findViewById(R.id.edit_text);
        text_view = (TextView)findViewById(R.id.plan);
    }

    public void switch_activity3(View view){
        input_text = edit_Text.getText().toString();
        String part1 = " is died of unknown reason.";
        String part2 = "   Your request has been sent.\n\n";
        text_view.setGravity(Gravity.CENTER);
        String final_string = part2 + input_text + part1;
        text_view.setText(final_string);
        text_view.setVisibility(View.VISIBLE);
        edit_Text.setVisibility(View.GONE);
    }

}