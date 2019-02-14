package com.study.patterns.facade;

public class Main {
    public static void main(String[] args) {
        StereoFacade facade = new StereoFacade(new Stereo());
        facade.play();
        facade.stop();
    }
}
