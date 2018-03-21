package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dayOfBirth;
    private final int postsQuantity;

    public ForumUser(int id, String name, char sex, LocalDate dayOfBirth, int postsQuantity) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dayOfBirth = dayOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dayOfBirth=" + dayOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
