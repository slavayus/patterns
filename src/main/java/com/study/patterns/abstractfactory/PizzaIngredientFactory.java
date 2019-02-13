package com.study.patterns.abstractfactory;

import com.study.patterns.abstractfactory.cheese.Cheese;

public interface PizzaIngredientFactory {
    Cheese provideCheese();
}
