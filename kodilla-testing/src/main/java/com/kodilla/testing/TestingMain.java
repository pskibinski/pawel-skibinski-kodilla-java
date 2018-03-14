package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc =  new Calculator();

        Integer sum = calc.add(5,6);
        Integer difference = calc.subtract(10,3);

        if(sum.equals(calc.add(5,6))) {
            System.out.println("Add test is ok!");
        } else {
            System.out.println("Error!");
        }

        if(difference.equals(calc.subtract(10,3))) {
            System.out.println("Subtract test is ok!");
        } else {
            System.out.println("Error");
        }

    }
}
