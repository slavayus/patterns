package com.study.patterns.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("Peperoni")) {
            return new PeperoniPizza();
        } else {
            return new CheesePizza();
        }
    }
}
