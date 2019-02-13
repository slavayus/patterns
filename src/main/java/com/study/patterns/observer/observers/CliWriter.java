package com.study.patterns.observer.observers;

import com.study.patterns.observer.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CliWriter implements Observer {
    private final WeatherData weatherData;

    public CliWriter(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("From cli: " + o);
    }
}
