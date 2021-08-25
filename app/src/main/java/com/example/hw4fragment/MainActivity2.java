package com.example.hw4fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView author, song, duration;

    Songs songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();
        Intent i = getIntent();
        songs = (Songs)i.getSerializableExtra("key");
        setContent();

    }

    private void setContent() {
        author.setText(String.valueOf(songs.getAuthor()));
        song.setText(String.valueOf(songs.getSong()));
        duration.setText(String.valueOf(songs.getDuration()));
    }

    private void initViews() {
        author = findViewById(R.id.author_tv);
        song = findViewById(R.id.song_tv);
        duration = findViewById(R.id.duration_tv);
    }
}