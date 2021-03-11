package com.ltechresources.gittestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Test Demo", Toast.LENGTH_SHORT).show();

        System.out.println("This change is done by me");

        TextView textView = findViewById(R.id.text);
        textView.setText("This is new Data");

    }



}
