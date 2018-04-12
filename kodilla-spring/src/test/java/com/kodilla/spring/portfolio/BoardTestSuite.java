package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.doneList.addTask("Learn Stream");
        board.inProgressList.addTask("Learn Spring");
        board.toDoList.addTask("Learn Hibernate");
        //When
        String doneTask = board.doneList.getTask(0);
        String inProgressTask = board.inProgressList.getTask(0);
        String toDoList = board.toDoList.getTask(0);
        //Then
        Assert.assertEquals("Learn Stream", doneTask);
        Assert.assertEquals("Learn Spring", inProgressTask);
        Assert.assertEquals("Learn Hibernate", toDoList);
    }
}
