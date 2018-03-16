package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {

    private String shapeName = "triangle";
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (side * sqrt(3)) / 4;
    }
}
