package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDayOfBirth().getYear() < 1998)
                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        result.entrySet().stream()
                .map(entry -> entry.getKey() + ". " + entry.getValue())
                .forEach(System.out::println);
    }
}


