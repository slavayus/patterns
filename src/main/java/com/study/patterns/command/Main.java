package com.study.patterns.command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Stereo stereo = new Stereo();
        control.setCommand(new StereoOnCommand(stereo));
        control.buttonWasPressed();
        control.setCommand(new StereoOffCommand(stereo));
        control.buttonWasPressed();
    }
}
