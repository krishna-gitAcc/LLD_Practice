package com.ObserverPattern.Observer;

import com.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
    }


    @Override
    public void update(){
        System.out.println("Updated over mobile" + stocksObservable.getStockCount());
    }
}
