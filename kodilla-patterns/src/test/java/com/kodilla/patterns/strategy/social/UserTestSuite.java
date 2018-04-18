package com.kodilla.patterns.strategy.social;

import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials john = new Millenials("John");
        YGeneration george = new YGeneration("George");
        ZGeneration victoria = new ZGeneration("Victoria");

        //When
        john.sharePost();
        george.sharePost();
        victoria.sharePost();
        //Then
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        Millenials john = new Millenials("John");

        //When
        john.setSocialPublisher(new TwitterPublisher());
        john.sharePost();
        //Then
    }
}
