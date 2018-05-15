package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;


public class SudokuElement {

    private int value = EMPTY;
    public static int EMPTY = 0;
    public List<Integer> availableNumbers = new ArrayList<>();


    public SudokuElement() {
        for(int i =1; i<=9; i++) {
            availableNumbers.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getAvailableNumbers() {
        return availableNumbers;
    }

    @Override
    public String toString() {
        return (value == EMPTY) ? "___" : "_" + value + "_";
    }
}
