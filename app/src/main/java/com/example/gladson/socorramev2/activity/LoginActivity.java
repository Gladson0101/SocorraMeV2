package com.example.gladson.socorramev2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gladson.socorramev2.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
    }
}
