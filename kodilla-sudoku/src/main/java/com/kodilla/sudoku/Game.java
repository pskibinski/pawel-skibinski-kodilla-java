package com.kodilla.sudoku;

public class Game {

    public void startGame() {
        Board board = new Board();
        SetBoard setBoard = new SetBoard();
        Resolve resolve = new Resolve();
        setBoard.setValue(board, resolve);
    }
}
