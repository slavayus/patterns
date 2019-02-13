package com.study.patterns.abstractfactory;

import com.study.patterns.abstractfactory.cheese.Cheese;
import com.study.patterns.abstractfactory.cheese.ReggianoCheese;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese provideCheese() {
        return new ReggianoCheese();
    }
}
