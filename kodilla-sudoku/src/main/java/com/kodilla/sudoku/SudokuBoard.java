package com.kodilla.sudoku;
import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    List<SudokuRow> sudokuRow = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i<9; i++) {
            sudokuRow.add(new SudokuRow());
        }
    }

    public SudokuElement getElement(int col, int row) {
        return sudokuRow.get(row).getCol().get(col);
    }

    @Override
    public String toString() {
        String s = " ___ ___ ___ ___ ___ ___ ___ ___ ___";
        for(SudokuRow r : sudokuRow) {
            s += "\n" + r.toString();
        }
        return s;
    }
}
