import Behavioral.Observe.ObserveableImpl.iphoneStockObservable;
import Behavioral.Observe.ObserveableImpl.stockObservable;
import Behavioral.Observe.ObserverImpl.emailAlertObserver;
import Behavioral.Observe.ObserverImpl.mobileAlertObserver;
import Behavioral.Observe.ObserverImpl.notificationObserver;

void main() {
    stockObservable observer = new iphoneStockObservable();

    notificationObserver observer1 = new emailAlertObserver(observer , "x@gmail.com");
    notificationObserver observer2 = new mobileAlertObserver(observer , "tareq");

    observer.addObserver(observer1);
    observer.addObserver(observer2);

    observer.setData(10);
    observer.setData(0);
    observer.setData(5);
}
