package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {

    private String shapeName = "circle";
    private double pi = 3.1415;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return pi * (pow(radius,2));
    }
}
