package com.study.patterns.observer.observers;

import com.study.patterns.observer.observable.WeatherData;

public class WebWriter implements Observer {
    private final WeatherData weatherData;

    public WebWriter(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature) {
        System.out.println("From web: " + temperature);
    }
}
