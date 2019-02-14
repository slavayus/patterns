package com.study.patterns.adapter;

import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(1, 5).forEach(i -> turkey.fly());
    }
}
