package com.ObserverPattern.Subject;

import com.ObserverPattern.Observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
