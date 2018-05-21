package com.sudoku;

import org.junit.Test;

public class SudokuTestSuite {

    public void setBoard(Board board) {
        board.getElement(0, 3).setValue(8);
        board.getElement(0, 5).setValue(7);
        board.getElement(0, 6).setValue(9);
        board.getElement(0, 7).setValue(4);
        board.getElement(0, 8).setValue(6);
        board.getElement(1, 5).setValue(6);
        board.getElement(1, 8).setValue(8);
        board.getElement(2, 1).setValue(9);
        board.getElement(2, 3).setValue(1);
        board.getElement(2, 4).setValue(4);
        board.getElement(2, 7).setValue(2);
        board.getElement(2, 8).setValue(7);
        board.getElement(3, 0).setValue(5);
        board.getElement(3, 2).setValue(1);
        board.getElement(3, 5).setValue(2);
        board.getElement(3, 7).setValue(7);
        board.getElement(4, 5).setValue(9);
        board.getElement(4, 6).setValue(5);
        board.getElement(4, 8).setValue(3);
        board.getElement(5, 4).setValue(7);
        board.getElement(5, 6).setValue(8);
        board.getElement(5, 7).setValue(1);
        board.getElement(6, 2).setValue(8);
        board.getElement(6, 3).setValue(2);
        board.getElement(7, 1).setValue(7);
        board.getElement(8, 0).setValue(3);
        board.getElement(8, 3).setValue(7);
        board.getElement(8, 4).setValue(6);
        board.getElement(8, 5).setValue(4);
        board.getElement(8, 7).setValue(8);
    }

    @Test
    public void testResolve() {
        //Given
        Board board = new Board();
        Resolve resolve = new Resolve();
        setBoard(board);

        //When
        resolve.solve(board);
        System.out.println(board);

        //Then
    }

}
