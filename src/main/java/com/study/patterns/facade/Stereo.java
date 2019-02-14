package com.study.patterns.facade;

class Stereo {

    private int volume;

    void on() {
        System.out.println("Stereo is on");
    }

    void off() {
        System.out.println("Stereo is off");
    }

    void setCd() {
        System.out.println("Stereo is set for CD input");
    }

    void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo volume is: " + this.volume);
    }

    int getVolume() {
        return volume;
    }
}
