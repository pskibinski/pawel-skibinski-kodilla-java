package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "square";
    private double side;


    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return side * side;
    }
}
