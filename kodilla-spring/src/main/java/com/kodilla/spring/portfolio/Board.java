package com.kodilla.spring.portfolio;

public class Board {

    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
}
