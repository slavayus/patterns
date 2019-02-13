package com.study.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.description + ": " + espresso.cost());

        Mocha mocha = new Mocha(espresso);
        System.out.println(mocha.description + ": " + mocha.cost());
    }
}
