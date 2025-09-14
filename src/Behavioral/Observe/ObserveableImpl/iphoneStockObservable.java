package Behavioral.Observe.ObserveableImpl;

import Behavioral.Observe.ObserverImpl.notificationObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneStockObservable implements stockObservable {

   List<notificationObserver> observerlist = new ArrayList<>();
   int stock = 0;

    @Override
    public void addObserver(notificationObserver o) {
        observerlist.add(o);
    }

    @Override
    public void removeObserver(notificationObserver o) {
        observerlist.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (notificationObserver o : observerlist) {
            o.update();
        }
    }

    @Override
    public void setData(int data) {
        if(stock != 0){
            notifyObservers();
        }
        stock += data;
    }

    @Override
    public int getData() {
        return stock;
    }
}
