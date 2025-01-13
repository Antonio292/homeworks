package com.homeworks.social_media_app;

public class PremiumUser extends User{
    private int  subscriptionEndDate;


    public PremiumUser(String id, String name, String email, int subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public boolean isActive() {
        boolean isActive = false;
        if (subscriptionEndDate < 31) {
            isActive = true;
        }
        return isActive;
    }

    @Override
    public void showInfo() {
        System.out.println("Id премиум пользователя: " + id + ",\n" +
                "Имя премиум пользователя: " + name + ",\n" +
                "Электронная почта премиум пользователя: " + email + "\n" +
                "До окончания подписки осталось " + subscriptionEndDate + " дней.");
    }
}
