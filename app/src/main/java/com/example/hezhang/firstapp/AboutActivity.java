package com.example.hezhang.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        String data = intent.getStringExtra("extra_data");
        Toast.makeText(AboutActivity.this, data, Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_about);
    }
}
