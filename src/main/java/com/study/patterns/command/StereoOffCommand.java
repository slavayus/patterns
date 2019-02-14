package com.study.patterns.command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(stereo.getVolume());
    }
}
