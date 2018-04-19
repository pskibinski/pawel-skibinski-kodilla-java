package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactorTestSuite {

    @Test
    public void testFactorSquare() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(shapeFactory.SQUARE);
        //Then
        Assert.assertEquals(28.0, square.getCircumference(),0);
        Assert.assertEquals(49, square.getArea(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactorCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(shapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(shapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals(35, rectangle.getCircumference(), 0);
    }

}
