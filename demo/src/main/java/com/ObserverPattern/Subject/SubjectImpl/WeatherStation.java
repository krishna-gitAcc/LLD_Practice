package com.ObserverPattern.Subject.SubjectImpl;

import com.ObserverPattern.Observer.Observer;
import com.ObserverPattern.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private String weather;

    public WeatherStation(){
        observers = new ArrayList<>();
        weather = "";
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
        return;
    }

    @Override
    public void  removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public  void notifyObserver(){
        observers.forEach(observer -> observer.update(weather));
    }

    public void setWeather(String newWeather){
        this.weather = newWeather;
        notifyObserver();
    }
}
