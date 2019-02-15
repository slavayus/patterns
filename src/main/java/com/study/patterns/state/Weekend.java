package com.study.patterns.state;

public class Weekend implements Activity {

    @Override
    public void doSomething(Human human) {
        System.out.println("Weekend!(zzz)");
        human.setActivity(human.getWork());
    }
}
