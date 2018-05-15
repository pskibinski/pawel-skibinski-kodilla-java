package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class ResolveSudoku {

    public boolean resolve(SudokuBoard sudokuBoard) {
        while(true) {
            int sum = 0;

            for(int col = 0; col<9; col++) {
                for(int row=0; row<9; row++) {
                    removePossiblesFromRow(sudokuBoard, sudokuBoard.getElement(col, row), row);
                    removePossiblesFromCol(sudokuBoard, sudokuBoard.getElement(col, row), col);
                    removePossiblesFromBox(sudokuBoard, sudokuBoard.getElement(col, row), col, row);
                    setElementValue(sudokuBoard.getElement(col, row));
                    sum = sum + sudokuBoard.getElement(col, row).getValue();
                }
            }

            if(sum == 405) {
                return true;
            }
        }
    }

    private void removePossiblesFromRow(SudokuBoard sudokuBoard, SudokuElement element, int row) {
        for(int i=0; i<9; i++) {
            Integer value = sudokuBoard.getElement(i, row).getValue();
            if(value != EMPTY) {
                element.getAvailableNumbers().remove(value);
            }
        }
    }

    private void removePossiblesFromCol(SudokuBoard sudokuBoard, SudokuElement element, int col) {
        for(int i=0; i<9; i++) {
            Integer value = sudokuBoard.getElement(col, i).getValue();
            if(value != EMPTY) {
                element.getAvailableNumbers().remove(value);
            }
        }
    }

    private void removePossiblesFromBox(SudokuBoard sudokuBoard, SudokuElement element, int col, int row) {
        int rowStart = (row/3) * 3;
        int rowEnd = rowStart + 3;
        int colStart = (col/3) * 3;
        int colEnd = colStart + 3;

        for(int c = colStart; c<colEnd; c++) {
            for(int r= rowStart; r<rowEnd; r++) {
                Integer value = sudokuBoard.getElement(c, r).getValue();
                if(value != EMPTY) {
                    element.getAvailableNumbers().remove(value);
                }
            }
        }
    }

    private void setElementValue(SudokuElement element) {
        Integer value = element.getValue();
        if(value == EMPTY && element.getAvailableNumbers().size() == 1) {
            element.setValue(element.getAvailableNumbers().get(0));
            element.getAvailableNumbers().remove(0);
        }
    }
}


