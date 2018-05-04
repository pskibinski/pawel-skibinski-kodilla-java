package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;


public class SudokuElement {

    private int value = EMPTY;
    public static int EMPTY = -1;
    private List<Integer> availableNumbers = new ArrayList<>();


    public SudokuElement() {
        for(int i =0; i<=8; i++) {
            availableNumbers.add(0);
        }
    }

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
