package com.homeworks.interfaces;

public class FacebookAuth implements SocialAuth{
    private String token;

    @Override
    public void authenticate(String userCredentials) {

    }

    @Override
    public void getUserProfile() {

    }

    @Override
    public boolean checkLoginAttempt(int currentAttempts) {
        return SocialAuth.super.checkLoginAttempt(currentAttempts);
    }
}
