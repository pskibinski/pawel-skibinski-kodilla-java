package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Audrey Tate", 'F', LocalDate.of(1990,12,3), 5));
        userList.add(new ForumUser(2, "Darryl Chambers", 'M', LocalDate.of(1982,5,6), 0));
        userList.add(new ForumUser(3, "Geoffrey Wade", 'M', LocalDate.of(2000,1,17), 2));
        userList.add(new ForumUser(4, "Hattie Beck", 'F', LocalDate.of(1984,9,9), 20));
        userList.add(new ForumUser(5, "Alyssa Vargas", 'F', LocalDate.of(1975, 10, 10), 50));
        userList.add(new ForumUser(6, "Allen Mclaughlin",'M', LocalDate.of(1996,1,18), 24));
        userList.add(new ForumUser(7, "Debra Torres", 'F', LocalDate.of(1992,2,5), 0));
        userList.add(new ForumUser(8, "Diane Garner", 'F', LocalDate.of(1986,7,22), 100));
        userList.add(new ForumUser(9, "Neil Mills", 'M', LocalDate.of(1991,11,12), 55));
        userList.add(new ForumUser(10, "Mercedes Hardy", 'F', LocalDate.of(1980,4, 24), 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
