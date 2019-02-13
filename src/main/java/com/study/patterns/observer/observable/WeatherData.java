package com.study.patterns.observer.observable;

import java.util.Observable;

public class WeatherData extends Observable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }
}
