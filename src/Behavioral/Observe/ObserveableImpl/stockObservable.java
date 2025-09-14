package Behavioral.Observe.ObserveableImpl;

import Behavioral.Observe.ObserverImpl.notificationObserver;

public interface stockObservable {
    public void addObserver(notificationObserver o);
    public void removeObserver(notificationObserver o);
    public void notifyObservers();
    public void setData(int data);
    public int getData();
}
