package com.study.patterns.strategy;

public class MallardDuck extends Duck {

    MallardDuck() {
        this.flyBehavior = new FlyWithWIngs();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
