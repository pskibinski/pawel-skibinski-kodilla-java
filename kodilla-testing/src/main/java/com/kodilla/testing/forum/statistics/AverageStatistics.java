package com.kodilla.testing.forum.statistics;

public class AverageStatistics {


    private double usersQuantity;
    private double postsQuantity;
    private double commentsQuantity;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;



    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity>0) {
            postsPerUser = postsQuantity / usersQuantity;
        } else {
            System.out.println("There are no users yet.");
        }

        if(usersQuantity>0) {
            commentsPerUser = commentsQuantity / usersQuantity;
        } else {
            System.out.println("There are no users yet.");
        }

        if(postsQuantity>0) {
            commentsPerPost = commentsQuantity / postsQuantity;
        } else {
            System.out.println("There are no posts yet.");
        }

    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
