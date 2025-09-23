package com.ObserverPattern;

import com.ObserverPattern.Observable.IphoneObservableImpl;
import com.ObserverPattern.Observable.StocksObservable;
import com.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl(iphoneStocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl(iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
