package com.study.patterns.factorymethod;

import com.study.patterns.factorymethod.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Ordered pizza: " + pizza.getDescription());
    }
}
