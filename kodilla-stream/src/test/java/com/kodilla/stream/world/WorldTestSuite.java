package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europa = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Country poland =  new Country(new BigDecimal("38422346"));
        Country denmark = new Country(new BigDecimal("5678348"));
        Country finland = new Country(new BigDecimal("5503297"));
        Country algeria =  new Country(new BigDecimal("33770000"));
        Country cameroon =  new Country(new BigDecimal("18100000"));
        Country nigeria =  new Country(new BigDecimal("146255312"));
        Country japan =  new Country(new BigDecimal("127078679"));
        Country southKorea =  new Country(new BigDecimal("48975000"));
        Country china =  new Country(new BigDecimal("1330044605"));

        //When
        europa.addCountry(poland);
        europa.addCountry(denmark);
        europa.addCountry(finland);
        africa.addCountry(algeria);
        africa.addCountry(cameroon);
        africa.addCountry(nigeria);
        asia.addCountry(japan);
        asia.addCountry(southKorea);
        asia.addCountry(china);
        world.addContinent(europa);
        world.addContinent(africa);
        world.addContinent(asia);

        //Then
        BigDecimal expected = new BigDecimal("1753827587");
        Assert.assertEquals(expected, world.getPeopleQuantity());
    }
}
