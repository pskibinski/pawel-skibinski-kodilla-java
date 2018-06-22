package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Homework homework) {
        updateCount++;
        System.out.println(name + ": You have " + updateCount + " new " + checkCount() + " from " + homework.getName());
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    private String checkCount() {
        return updateCount == 1 ? "task" : "tasks";
    }
}
