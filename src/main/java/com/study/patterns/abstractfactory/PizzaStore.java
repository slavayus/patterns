package com.study.patterns.abstractfactory;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        System.out.println(pizzaIngredientFactory.provideCheese().getMessage());
        pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        System.out.println(pizzaIngredientFactory.provideCheese().getMessage());
    }
}
