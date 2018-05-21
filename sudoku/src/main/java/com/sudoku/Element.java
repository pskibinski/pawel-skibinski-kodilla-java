package com.sudoku;

public class Element {
    private int value = EMPTY;
    public static int EMPTY = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return (value == EMPTY) ? "___" : "_" + value + "_";
    }
}
