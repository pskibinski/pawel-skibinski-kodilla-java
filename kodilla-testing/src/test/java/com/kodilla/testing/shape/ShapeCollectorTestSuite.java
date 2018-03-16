package com.kodilla.testing.shape;

import org.junit.*;



public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("This is the end of tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        Circle circle = new Circle(3.2);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(2, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(6);
        //When
        shapeCollector.addFigure(square);
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, retrievedFigure);
        Assert.assertEquals("square", square.getShapeName());
    }
}
