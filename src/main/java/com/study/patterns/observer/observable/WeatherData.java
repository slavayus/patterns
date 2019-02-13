package com.study.patterns.observer.observable;

import com.study.patterns.observer.observers.Observer;

import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private int temperature;

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature));
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
