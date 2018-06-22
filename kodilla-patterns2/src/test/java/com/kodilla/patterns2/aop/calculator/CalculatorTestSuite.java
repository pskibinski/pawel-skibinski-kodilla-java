package com.kodilla.patterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        //Given

        //When
        double result = calculator.add(5, 6);

        //Then
        LOGGER.info("Testing add method");
        assertEquals(11, result, 0);
    }

    @Test
    public void testSub() {
        //Given

        //When
        double result = calculator.sub(26, 18);

        //Then
        LOGGER.info("Testing subtract method");
        assertEquals(8, result, 0);
    }

    @Test
    public void testMul() {
        //Given

        //When
        double result = calculator.mul(5, 5);

        //Then
        LOGGER.info("Testing multiply method");
        assertEquals(25, result, 0);
    }

    @Test
    public void testDiv() {
        //Given

        //When
        double result = calculator.div(30, 5);

        //Then
        LOGGER.info("Testing divide method");
        assertEquals(6, result, 0);
    }

    @Test
    public void testFactorial() {
        //Given

        //When
        BigDecimal result = calculator.factorial(new BigDecimal("1000"));

        //Then
        LOGGER.info("Testing factorial method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }
}
