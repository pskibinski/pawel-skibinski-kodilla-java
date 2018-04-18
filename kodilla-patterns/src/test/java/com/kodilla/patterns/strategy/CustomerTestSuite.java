package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictor.BalancedPredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should buy: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should buy: " + kodillaShouldBuy);

        //Then
        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Found XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategies() {
        //Given
        Customer john = new IndividualCustomer("John Hemerald");

        //When
        String johnShouldBuy = john.predict();
        System.out.println("John should buy: " + johnShouldBuy);
        john.setBuyPredictor(new BalancedPredictor());
        johnShouldBuy = john.predict();
        System.out.println("John should buy: " + johnShouldBuy);

        //Then
        Assert.assertEquals("[Balanced predictor] Buy shared units of Found XYZ", johnShouldBuy);
    }
}
