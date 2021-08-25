package com.example.hw4fragment;

import java.io.Serializable;

public class Songs implements Serializable {

    private String song;
    private String author;
    private String duration;

    public Songs(String song, String author, String duration) {
        this.song = song;
        this.author = author;
        this.duration = duration;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
