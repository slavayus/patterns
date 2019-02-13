package com.study.patterns.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("All ducks swim");
    }

}
