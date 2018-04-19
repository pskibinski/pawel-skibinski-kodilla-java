package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testCreateTaskShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shop = taskFactory.createTask(TaskFactory.SHOP);
        shop.executeTask();
        //Then
        Assert.assertEquals("Tesco", shop.getTaskName());
        Assert.assertTrue(shop.isTaskExecuted());
    }

    @Test
    public void testCreateTaskPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paint = taskFactory.createTask(TaskFactory.PAINT);
        //Then
        Assert.assertFalse(paint.isTaskExecuted());
        Assert.assertEquals("Homework", paint.getTaskName());
    }

    @Test
    public void testCreateTaskDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drive = taskFactory.createTask(TaskFactory.DRIVE);
        drive.executeTask();
        //Then
        Assert.assertEquals("Trip", drive.getTaskName());
        Assert.assertTrue(drive.isTaskExecuted());
    }
}
