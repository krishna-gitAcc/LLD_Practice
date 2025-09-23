package com.ObserverPattern.Observer;

import com.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
    }


    @Override
    public void update(){
        System.out.println("Updated over email" + stocksObservable.getStockCount());
    }
}
