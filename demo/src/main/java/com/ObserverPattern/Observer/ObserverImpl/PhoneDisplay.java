package com.ObserverPattern.Observer.ObserverImpl;

import com.ObserverPattern.Observer.Observer;

public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    public void update(String newWeather){
        this.weather = newWeather;
        this.display();
    }

    private void display(){
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
