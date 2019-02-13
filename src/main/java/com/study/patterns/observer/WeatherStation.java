package com.study.patterns.observer;

import com.study.patterns.observer.observable.WeatherData;
import com.study.patterns.observer.observers.CliWriter;
import com.study.patterns.observer.observers.WebWriter;

import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new ArrayList<>());

        CliWriter cliWriter = new CliWriter(weatherData);
        WebWriter webWriter = new WebWriter(weatherData);

        weatherData.setTemperature(3);


    }
}
