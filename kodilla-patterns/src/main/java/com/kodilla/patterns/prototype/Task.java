package com.kodilla.patterns.prototype;

import java.util.Objects;

public final class Task {

    final private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "      Task: [" + name + "]";
    }
}
