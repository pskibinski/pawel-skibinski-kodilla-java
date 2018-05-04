package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuBoard {

    List<SudokuRow> sudokuRow = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i<9; i++) {
            sudokuRow.add(new SudokuRow());
        }
    }

    public void addNumber() {
        Scanner scanner = new Scanner(System.in);
        String cord = scanner.nextLine();
        int row = Integer.parseInt(cord.substring(0,1));
        int col = Integer.parseInt(cord.substring(1,2));
        int n = Integer.parseInt(cord.substring(2,3));
        SudokuElement se = new SudokuElement();
        se.setValue(n);
        sudokuRow.get(row).getCol().add(col, se);
        sudokuRow.get(row).getCol().remove(col + 1);
    }

    public void resolveSudoku() {
        int counter = 0;
            for(SudokuElement e : sudokuRow.get(counter).getCol()) {
                if(e.getValue() != e.EMPTY) {

                }
            }
            counter++;
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
