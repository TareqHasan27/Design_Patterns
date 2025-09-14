package Behavioral.Observe.ObserverImpl;

import Behavioral.Observe.ObserveableImpl.stockObservable;

import java.util.Observable;
import java.util.Observer;

public class mobileAlertObserver implements notificationObserver {
    String name;
    stockObservable stockObservable;
    public mobileAlertObserver(stockObservable stockObservable, String name) {
        this.stockObservable = stockObservable;
        this.name = name;
    }
    @Override
    public void update() {
        sendNotification("New Iphone is loading" , name );
    }

    public void sendNotification(String message, String name) {
        System.out.println("Notification Observer has been sent to " + name + " with message " + message );
    }
}
