package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("poppy-seed")
                .ingredient("bacon")
                .ingredient("onion")
                .sauce("Thousand Islands")
                .burgers(2)
                .build();
        //When
        //Then
        Assert.assertEquals("poppy-seed", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getIngredients().size());
    }
}
