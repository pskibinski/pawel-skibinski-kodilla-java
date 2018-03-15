package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void TestCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("Forum User", "John Smith");
        //When
        String result = user.getUsername();
        //Then
        Assert.assertEquals("Forum User", result);
    }

    @Test
    public void TestCaseRealName() {
        //Given
        SimpleUser user = new SimpleUser("Forum User", "John Smith");
        //When
        String result = user.getRealName();
        //Then
        Assert.assertEquals("John Smith", result);
    }
}

