package com.study.patterns.factorymethod;

import com.study.patterns.factorymethod.pizza.CheesePizza;
import com.study.patterns.factorymethod.pizza.PeperoniPizza;
import com.study.patterns.factorymethod.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Peperoni")) {
            return new PeperoniPizza();
        } else {
            return new CheesePizza();
        }
    }
}
