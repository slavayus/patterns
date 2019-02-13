package com.study.patterns.singleton;

class Singleton {
    private static Singleton INSTANCE;
    private int i = 43;

    private Singleton() {
    }

    public int getI() {
        return i;
    }

    static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
