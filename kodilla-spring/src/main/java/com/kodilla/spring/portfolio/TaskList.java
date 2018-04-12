package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    public List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public String getTask(int i) {
        return tasks.get(i);
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}
