package com.kodilla.patterns.builder.checkers;

import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {

    @Test
    public void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .playerOne("John")
                .playerTwo("Theresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 5)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 5, 5)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure one = checkers.getBoard().getFigure(0, 3);
        Figure two = checkers.getBoard().getFigure(9, 5);
        Figure three = checkers.getBoard().getFigure(5, 5);
        Figure four = checkers.getBoard().getFigure(8, 1);

        //Then
        Assert.assertEquals(Figure.WHITE, one.getColor());
        Assert.assertEquals(Pawn.class, two.getClass());
        Assert.assertEquals(Queen.class, three.getClass());
        Assert.assertNull(four);
    }
}
