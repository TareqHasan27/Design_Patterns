package Behavioral.Observe.ObserverImpl;

import Behavioral.Observe.ObserveableImpl.stockObservable;

public class emailAlertObserver implements notificationObserver {
    String emailId;
    stockObservable stockObservable;

    public emailAlertObserver(stockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    public void sendEmail(String emailId) {
        System.out.println("Sending email to " + emailId);
    }
}
