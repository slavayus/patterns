package com.study.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = new Rectangle();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite2.addComponent(circle2);
        composite2.addComponent(rectangle1);
        composite2.addComponent(rectangle2);

        composite1.addComponent(composite2);
        composite1.addComponent(circle1);

        composite1.draw();
    }
}
