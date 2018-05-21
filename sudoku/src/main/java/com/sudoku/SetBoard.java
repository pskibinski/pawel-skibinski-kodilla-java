package com.sudoku;

import java.util.Scanner;

public class SetBoard {

    public void setValue(Board board) {
        String number;
        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.println("Enter value (RowColValue), type SUDOKU to resolve or type EXIT.");
            number = in.nextLine().toLowerCase();

            if(number.equals("sudoku")) {
                Resolve resolve = new Resolve();
                resolve.solve(board);
                System.out.println(board);
                System.out.println("Type NEW to start over or type EXIT. ");
                number = in.nextLine().toLowerCase();
                if(number.equals("new")) {
                    newBoard(board);
                } else {
                    return;
                }
            } else if(number.equals("exit")) {
                return;
            } else {
                try {
                    if (number.length() > 2) {
                        int row = Integer.parseInt(number.substring(0, 1));
                        int col = Integer.parseInt(number.substring(1, 2));
                        int value = Integer.parseInt(number.substring(2, 3));
                        board.getElement(row - 1, col - 1).setValue(value);
                        System.out.println(board);
                    }
                    } catch(NumberFormatException e){
                        System.out.println("You have to type number (RowColValue)");
                    }
            }
        }
    }

    private void newBoard(Board board) {
        for(int row=0; row<9; row++) {
            for(int col=0; col<9; col++) {
                board.getElement(row, col).setValue(0);
            }
        }
    }
}
