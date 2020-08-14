package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class  MainActivity extends AppCompatActivity {
//Single line comment
    /*
    multi line
     comment */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}