package ObserverPattern.NotifyMeStockExample;

import ObserverPattern.NotifyMeStockExample.Observable.OnePlusObservable;
import ObserverPattern.NotifyMeStockExample.Observable.StocksObservable;
import ObserverPattern.NotifyMeStockExample.Observable.iPhoneObservable;
import ObserverPattern.NotifyMeStockExample.Observer.EmailAlertObserver;
import ObserverPattern.NotifyMeStockExample.Observer.MobileAlertObserver;
import ObserverPattern.NotifyMeStockExample.Observer.NotifAlertObserver;

public class Demo {

    public static void main(String[] args) {
        StocksObservable iPhoneObservable = new iPhoneObservable("IPhone", 5);
        StocksObservable onePlusObservable = new OnePlusObservable("OnePlus", 5);

        NotifAlertObserver obs1 = new EmailAlertObserver(iPhoneObservable, "abc@xyz.com");
        NotifAlertObserver obs2 = new MobileAlertObserver(iPhoneObservable, "+91 1234567890");
        NotifAlertObserver obs3 = new MobileAlertObserver(onePlusObservable, "+91 1234567890");

        iPhoneObservable.add(obs1);
        iPhoneObservable.add(obs2);

        onePlusObservable.add(obs3);

        iPhoneObservable.setStockCount(10);
        onePlusObservable.setStockCount(20);
    }
    
}
