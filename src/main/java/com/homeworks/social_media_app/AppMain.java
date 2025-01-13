package com.homeworks.social_media_app;

public class AppMain {
    public static void main(String[] args) {
        User user = new User("j123", "anton", "...@gmail.com");
        user.showInfo();
        User ignat = new User("1", "Ignat", "...com");
        User igor = new User("2", "Igor", "...com");
        User ania = new User("3", "Ania", "...com");
        user.addFriend(ignat);
        user.addFriend(igor);
        user.addFriend(ania);
        user.showFriendList();
        user.removeFriend(ignat);
        user.showFriendList();
        String contentIgor = "Hi, Ania!";
        String contentAnia = "Hi, Igor!";
        igor.createPost(contentIgor);
        ania.createPost(contentAnia);
        igor.viewFriendsPosts();
        ania.viewFriendsPosts();
        user.viewFriendsPosts();

        System.out.println("----------");
        PremiumUser premiumUser = new PremiumUser("j234", "Antonio", "...com", 29);
        premiumUser.showInfo();
        premiumUser.isActive();
        System.out.println("----------");
        AdminUser user1 = new AdminUser("j345", "Antony", "...com", true);
        user1.showInfo();
        user1.addBlockList(user);
        user1.showBlockList();
        System.out.println("----------");
    }
}
