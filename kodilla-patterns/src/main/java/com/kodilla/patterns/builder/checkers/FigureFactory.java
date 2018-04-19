package com.kodilla.patterns.builder.checkers;

public class FigureFactory {

    public static final String PAWN = "Pawn";
    public static final String QUEEN = "Queen";

    public static Figure makeFigure(String FigureType, String color) {
        if(FigureType.equals(PAWN)) {
            return new Pawn(color);
        } else if(FigureType.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen.");
        }
    }
}
