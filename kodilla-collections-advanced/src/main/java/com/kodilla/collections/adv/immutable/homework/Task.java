package com.kodilla.collections.adv.immutable.homework;

public class Task {
    private String title;
    private String duration;

    public Task(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}
