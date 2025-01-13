package com.homeworks.social_media_app;

public class Post {
    private String author;
    private String content;
    private long likes = 0;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public void like() {
        likes += 1;
    }

    public String getContent() {
        return content;
    }
}
