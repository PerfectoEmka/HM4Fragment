package com.example.hw4fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.firstContainer, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.secondContainer, new SecondFragment()).commit();
    }
}