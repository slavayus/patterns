package com.study.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        Turkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();
        duck = new TurkeyAdapter(turkey);
        duck.quack();
        duck.fly();
    }
}
