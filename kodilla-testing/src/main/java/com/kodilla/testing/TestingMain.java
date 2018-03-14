package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc =  new Calculator();

        Integer sum = calc.add(5,6);
        Integer difference = calc.subtract(10,3);

        if(sum.equals(11)) {
            System.out.println("Add test is ok!");
        } else {
            System.out.println("Error!");
        }

        if(difference.equals(7)) {
            System.out.println("Subtract test is ok!");
        } else {
            System.out.println("Error");
        }

    }
}
