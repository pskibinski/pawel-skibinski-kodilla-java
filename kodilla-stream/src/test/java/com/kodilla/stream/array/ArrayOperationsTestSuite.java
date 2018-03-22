package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {5, 10, 16, 13, 20};
        //When
        double avg = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(12.8, avg,0);
    }
}
