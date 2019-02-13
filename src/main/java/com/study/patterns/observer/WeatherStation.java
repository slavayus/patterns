package com.study.patterns.observer;

import com.study.patterns.observer.observable.WeatherData;
import com.study.patterns.observer.observers.CliWriter;
import com.study.patterns.observer.observers.WebWriter;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CliWriter cliWriter = new CliWriter(weatherData);
        WebWriter webWriter = new WebWriter(weatherData);

        weatherData.setTemperature(3);


    }
}
