package com.study.patterns.command;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is: " + volume);
    }
}
