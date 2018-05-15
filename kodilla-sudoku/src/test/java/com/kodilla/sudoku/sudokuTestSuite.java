package com.kodilla.sudoku;

import org.junit.Test;

public class sudokuTestSuite {

    private SudokuBoard board = new SudokuBoard();
    private ResolveSudoku resolveSudoku = new ResolveSudoku();

    public void setTestBoard(SudokuBoard board) {
        board.getElement(0, 2).setValue(6);
        board.getElement(1, 3).setValue(1);
        board.getElement(1, 4).setValue(2);
        board.getElement(1, 5).setValue(7);
        board.getElement(1, 6).setValue(3);
        board.getElement(1, 7).setValue(4);
        board.getElement(1, 8).setValue(6);
        board.getElement(2, 0).setValue(7);
        board.getElement(2, 3).setValue(8);
        board.getElement(2, 7).setValue(5);
        board.getElement(3, 1).setValue(7);
        board.getElement(3, 4).setValue(9);
        board.getElement(3, 8).setValue(8);
        board.getElement(4, 1).setValue(1);
        board.getElement(4, 6).setValue(5);
        board.getElement(5, 1).setValue(8);
        board.getElement(5, 2).setValue(3);
        board.getElement(5, 3).setValue(7);
        board.getElement(5, 4).setValue(5);
        board.getElement(5, 5).setValue(1);
        board.getElement(5, 6).setValue(9);
        board.getElement(6, 2).setValue(5);
        board.getElement(6, 3).setValue(6);
        board.getElement(6, 4).setValue(7);
        board.getElement(6, 5).setValue(3);
        board.getElement(6, 7).setValue(1);
        board.getElement(7, 1).setValue(4);
        board.getElement(7, 2).setValue(2);
        board.getElement(7, 4).setValue(8);
        board.getElement(7, 5).setValue(5);
        board.getElement(7, 7).setValue(7);
        board.getElement(8, 3).setValue(2);
        board.getElement(8, 4).setValue(1);
    }

    @Test
    public void testResolveSudoku() {
        setTestBoard(board);
        System.out.println(board);
        resolveSudoku.resolve(board);
        System.out.println(board);
    }
}
