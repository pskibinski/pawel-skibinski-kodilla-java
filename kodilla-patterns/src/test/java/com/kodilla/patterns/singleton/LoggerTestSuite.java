package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("17.04.2018 - Log in to account.");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("17.04.2018 - Log in to account.", result);
    }

}
