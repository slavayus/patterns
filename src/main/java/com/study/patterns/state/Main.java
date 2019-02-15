package com.study.patterns.state;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new Weekend());
        IntStream.range(0, 10).forEach(i -> human.doSomething());
    }
}
