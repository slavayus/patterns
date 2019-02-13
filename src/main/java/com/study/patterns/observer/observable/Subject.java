package com.study.patterns.observer.observable;

import com.study.patterns.observer.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
