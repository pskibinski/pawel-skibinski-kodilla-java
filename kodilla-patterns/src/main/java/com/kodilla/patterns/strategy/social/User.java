package com.kodilla.patterns.strategy.social;

public class User {

    final private String name;
    SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sharePost() {
        System.out.println(getName() + " uses: " + socialPublisher.share());
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
