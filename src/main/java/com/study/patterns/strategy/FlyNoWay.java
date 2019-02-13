package com.study.patterns.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cant't fly");
    }
}
