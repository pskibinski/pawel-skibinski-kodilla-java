package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addRes = calculator.add(25, 30);
        double subRes = calculator.sub(123, 57);
        double mulRes = calculator.mul(89, 20);
        double divRes = calculator.div(185, 23);
        //Then
        Assert.assertEquals(55, addRes, 0);
        Assert.assertEquals(66, subRes, 0);
        Assert.assertEquals(1780, mulRes, 0);
        Assert.assertEquals(8.04, divRes, 2);
    }
}
