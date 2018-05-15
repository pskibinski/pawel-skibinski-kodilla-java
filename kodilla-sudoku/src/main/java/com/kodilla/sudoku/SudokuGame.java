package com.kodilla.sudoku;

public class SudokuGame {
    public void startGame() {
        SudokuBoard sudokuBoard = new SudokuBoard();
        SetBoard setBoard = new SetBoard();
        ResolveSudoku resolveSudoku = new ResolveSudoku();

        setBoard.setInitialNumbers(sudokuBoard);
        resolveSudoku.resolve(sudokuBoard);
        System.out.println(sudokuBoard);
    }
}
