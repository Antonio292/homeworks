package com.homeworks.social_media_app;

public class AppMain {
    public static void main(String[] args) {
        User user = new User("j123", "anton", "...@gmail.com");
        user.showInfo();
        PremiumUser premiumUser = new PremiumUser("j234", "Antonio", "...com", 29);
        premiumUser.showInfo();
        premiumUser.isActive();
        AdminUser user1 = new AdminUser("j345", "Antony", "...com", true);
        user1.showInfo();
        user1.addBlockList(user);
        user1.showBlockList();
    }
}
