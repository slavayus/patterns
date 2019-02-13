package com.study.patterns.factory;

public class PizzaStore {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        System.out.println(pizzaFactory.createPizza("Peperoni").getDescription());
        System.out.println(pizzaFactory.createPizza("").getDescription());
    }
}
