package com.study.patterns.factorymethod;

import com.study.patterns.factorymethod.pizza.CheesePizza;
import com.study.patterns.factorymethod.pizza.PeperoniPizza;
import com.study.patterns.factorymethod.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Peperoni")) {
            return new CheesePizza();
        } else {
            return new PeperoniPizza();
        }
    }
}
