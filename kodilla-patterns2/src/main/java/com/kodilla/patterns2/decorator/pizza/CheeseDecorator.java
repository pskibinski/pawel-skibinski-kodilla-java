package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends AbstractPizzaOrderDecorator {

    public CheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + cheese";
    }
}
