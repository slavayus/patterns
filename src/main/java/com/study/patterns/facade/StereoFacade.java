package com.study.patterns.facade;

class StereoFacade {
    private final Stereo stereo;

    StereoFacade(Stereo stereo) {
        this.stereo = stereo;
    }

    void play() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    void stop() {
        stereo.off();
    }
}
