package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithCheeseOliveSalamiRucolaGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new RucolaDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(24), cost);
    }

    @Test
    public void testPizzaOrderWithSalamiOlivegetIngredients() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new SalamiDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        //When
        String ingredients = pizza.getIngredients();

        //Then
        assertEquals("Thin crust + tomato sauce + salami + olives", ingredients);
    }
}
