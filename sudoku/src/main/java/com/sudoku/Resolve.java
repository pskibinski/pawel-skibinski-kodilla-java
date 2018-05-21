package com.sudoku;

import java.util.stream.IntStream;

import static com.sudoku.Element.EMPTY;

public class Resolve {
    private static int BOARD_SIZE = 9;

    public boolean solve(Board board) {
        for(int row=0; row<9; row++) {
            for(int col=0; col<9; col++) {
                if(board.getElement(row, col).getValue() == EMPTY) {
                    for(int value=1; value<=9; value++) {
                        board.getElement(row, col).setValue(value);
                        if(isValid(board, row, col) && solve(board)) {
                            return true;
                        }
                        board.getElement(row, col).setValue(EMPTY);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rowValid(Board board, int row) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(0, 9)
                .allMatch(col -> allCheck(board, row, constraint, col));
    }

    private boolean colValid(Board board, int col) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(0, 9)
                .allMatch(row -> allCheck(board, row, constraint, col));
    }

    private boolean boxValid(Board board, int row, int col) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        int rowStart = (row/3) * 3;
        int rowEnd = rowStart + 3;
        int colStart = (col/3) * 3;
        int colEnd = colStart + 3;

        for(int r=rowStart; r<rowEnd; r++) {
            for(int c=colStart; c<colEnd; c++) {
                if(!allCheck(board, r, constraint, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean allCheck(Board board, int row, boolean[] constraint, int col) {
        if(board.getElement(row, col).getValue() != EMPTY) {
            if(!constraint[board.getElement(row, col).getValue() - 1]) {
                constraint[board.getElement(row, col).getValue() - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(Board board, int row, int col) {
        return (rowValid(board, row) && colValid(board, col) && boxValid(board, row, col));
    }
}


