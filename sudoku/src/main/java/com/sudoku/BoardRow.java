package com.sudoku;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Element> boardCols = new ArrayList<>();

    public BoardRow() {
        for(int i = 0; i<9; i++) {
            boardCols.add(new Element());
        }
    }

    public List<Element> getCol() {
        return boardCols;
    }

    @Override
    public String toString() {
        String s = "|";
        for(Element e : boardCols) {
            s += e.toString() + "|";
        }
        return s;
    }
}
