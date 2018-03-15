package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Collection Test Case begin.");
    }

    @After
    public void after() {
        System.out.println("Collection Test Case end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite start!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite stop!");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list = ext.exterminator(emptyList);
        //Then
        Assert.assertEquals(true, list.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        for(int i=1; i<=100; i++) {
            numbers.add(i);
        }
        ArrayList<Integer> list = ext.exterminator(numbers);
        //Then
        for(int i : list)
        Assert.assertEquals(true, i%2==0);
    }
}
