package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> sudokuCol = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i<9; i++) {
            sudokuCol.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getCol() {
        return sudokuCol;
    }

    @Override
    public String toString() {
        String s = "|";
        for(SudokuElement e : sudokuCol) {
            s += e.toString() + "|";
        }
        return s;
    }
}
