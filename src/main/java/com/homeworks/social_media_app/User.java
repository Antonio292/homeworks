package com.homeworks.social_media_app;

import java.util.ArrayList;

public class User {
    protected String id;
    protected String name;
    protected String email;
    protected ArrayList<User> friendList = new ArrayList<>();
    protected ArrayList<Post> postsList = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Id пользователя: " + id + ",\n" +
                           "Имя пользователя: " + name + ",\n" +
                           "Электронная почта пользователя: " + email);
    }

    public void addFriend(User user) {
        if (user != null) {
            friendList.add(user);
        }
    }

    public void removeFriend(User user) {
        if (user != null) {
            friendList.remove(user);
        }
    }

    public Post createPost(String content) {
        Post post = new Post(name, content);
        if (content != null && !content.isEmpty()) {
            postsList.add(post);
        }
        return post;
    }

    public void viewFriendsPosts() {
        for (User user: friendList) {
            for (Post post: postsList) {
                System.out.println(post.getContent());
            }
        }
    }
}
