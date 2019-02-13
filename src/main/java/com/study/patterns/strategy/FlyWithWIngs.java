package com.study.patterns.strategy;

public class FlyWithWIngs implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
