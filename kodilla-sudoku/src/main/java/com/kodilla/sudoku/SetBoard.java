package com.kodilla.sudoku;

import java.util.Scanner;

public class SetBoard {

    public boolean setInitialNumbers(SudokuBoard sudokuBoard) {
        while(true) {
            System.out.println("Enter the number (ColRowValue) or type SUDOKU to resolve.");
            String number;
            Scanner in = new Scanner(System.in);
            number = in.nextLine().toLowerCase();

            if(number.equals("sudoku")) {
                return true;
            } else {
                int col = Integer.parseInt(number.substring(0, 1));
                int row = Integer.parseInt(number.substring(1, 2));
                int value = Integer.parseInt(number.substring(2, 3));
                sudokuBoard.getElement(col - 1, row - 1).setValue(value);
                System.out.println(sudokuBoard);
            }
        }
    }
}

