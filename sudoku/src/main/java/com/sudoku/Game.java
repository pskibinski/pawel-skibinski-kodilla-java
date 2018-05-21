package com.sudoku;

public class Game {

    public void starGame() {
        Board board = new Board();
        SetBoard setBoard = new SetBoard();
        setBoard.setValue(board);
    }
}
