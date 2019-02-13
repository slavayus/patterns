package com.study.patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        nyStylePizzaStore.orderPizza("Peperoni");
        chicagoStylePizzaStore.orderPizza("Peperoni");
    }
}
