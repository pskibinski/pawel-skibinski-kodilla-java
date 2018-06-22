package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        ForumUser pabloEscobar = new ForumUser("Pablo Escobar");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(jessiePinkman);
        javaHelpForum.registerObserver(pabloEscobar);
        javaToolsForum.registerObserver(pabloEscobar);

        //When
        javaHelpForum.addPost("Hi everyone! Could you hel me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work.");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");

        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, jessiePinkman.getUpdateCount());
        assertEquals(5, pabloEscobar.getUpdateCount());
    }
}
