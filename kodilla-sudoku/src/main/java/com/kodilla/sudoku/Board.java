package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> boardRows = new ArrayList<>();

    public Board() {
        for(int i = 0; i<9; i++) {
            boardRows.add(new BoardRow());
        }
    }

    public Element getElement(int row, int col) {
        return boardRows.get(row).getCol().get(col);
    }

    @Override
    public String toString() {
        String s = " ___ ___ ___ ___ ___ ___ ___ ___ ___";
        for(BoardRow r : boardRows) {
            s += "\n" + r.toString();
        }
        return s;
    }
}
