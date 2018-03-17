package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AverageStatisticsTestSuite {
    private static int i;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("End od tests.");
    }

    @Before
    public void beforeEveryTest() {
        i++;
        System.out.println("Test #" + i);
    }

    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<Integer> posts = new ArrayList<>();
        when(statisticsMock.postCount()).thenReturn(posts.size());
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(0, postsQuantity, 0);
        Assert.assertEquals(0, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statistcisMock = mock(Statistics.class);
        ArrayList<Integer> comments = new ArrayList<>();
        when(statistcisMock.commentsCount()).thenReturn(comments.size());
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statistcisMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(0, postsQuantity, 0);
        Assert.assertEquals(0, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<Integer> posts = new ArrayList<>();
        for(int i=0; i<1000; i++) { posts.add(i); }
        when(statisticsMock.postCount()).thenReturn(posts.size());
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(1000, postsQuantity, 0);
        Assert.assertEquals(0, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testMoreCommentsThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<Integer> posts = new ArrayList<>();
        ArrayList<Integer> comments = new ArrayList<>();
        for(int i=0; i<400; i++) { posts.add(i); }
        for(int n=0; n<600; n++) {comments.add(n); }
        when(statisticsMock.postCount()).thenReturn((posts.size()));
        when(statisticsMock.commentsCount()).thenReturn(comments.size());
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(400, postsQuantity, 0);
        Assert.assertEquals(600, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(1.5, commentsPerPost, 0);
    }

    @Test
    public void testMorePostsThenComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<Integer> posts = new ArrayList<>();
        ArrayList<Integer> comments = new ArrayList<>();
        for(int i=0; i<850; i++) { posts.add(i); }
        for(int n=0; n<620; n++) { comments.add(n); }
        when(statisticsMock.postCount()).thenReturn(posts.size());
        when(statisticsMock.commentsCount()).thenReturn(comments.size());
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(850, postsQuantity, 0);
        Assert.assertEquals(620, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0.72, commentsPerPost, 1);
    }

    @Test
    public void testHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<100; i++) { users.add("abc"); }
        when(statisticsMock.usersNames()).thenReturn(users);
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(100, usersQuantity, 0);
        Assert.assertEquals(0, postsQuantity, 0);
        Assert.assertEquals(0, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 1);
    }

    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        AverageStatistics averageStatistics = new AverageStatistics();
        //When
        averageStatistics.calculateAdvStatistics(statisticsMock);
        double usersQuantity = averageStatistics.getUsersQuantity();
        double postsQuantity = averageStatistics.getPostsQuantity();
        double commentsQuantity = averageStatistics.getCommentsQuantity();
        double postsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerUser = averageStatistics.getPostsPerUser();
        double commentsPerPost = averageStatistics.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, usersQuantity, 0);
        Assert.assertEquals(0, postsQuantity, 0);
        Assert.assertEquals(0, commentsQuantity, 0);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 1);
    }




}
