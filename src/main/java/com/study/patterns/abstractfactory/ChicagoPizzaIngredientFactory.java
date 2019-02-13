package com.study.patterns.abstractfactory;

import com.study.patterns.abstractfactory.cheese.Cheese;
import com.study.patterns.abstractfactory.cheese.MozzarellaCheese;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese provideCheese() {
        return new MozzarellaCheese();
    }
}
