package com.study.patterns.state;

public class Work implements Activity {
    private int i;

    @Override
    public void doSomething(Human human) {
        if (i < 5) {
            i++;
            System.out.println("Just do it!");
        } else {
            i = 0;
            human.setActivity(human.getWeekend());
        }
    }
}
