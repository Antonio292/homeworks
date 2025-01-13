package com.homeworks.social_media_app;

import java.util.ArrayList;
import java.util.List;

public class AdminUser extends User{
    private ArrayList<User> blockList = new ArrayList<>();
    private boolean isAdmin;

    public AdminUser(String id, String name, String email, boolean isAdmin) {
        super(id, name, email);
        this.isAdmin = isAdmin;
    }

    public void addBlockList(User user) {
        if (user != null) {
            blockList.add(user);
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Id Администратора: " + id + ",\n" +
                "Имя Администратора: " + name + ",\n" +
                "Электронная почта Администратора: " + email);
    }

    public void showBlockList() {
        if (!blockList.isEmpty()) {
            System.out.println(blockList.size());
            for (User user: blockList) {
                System.out.println(user);
            }
        }
    }
}
