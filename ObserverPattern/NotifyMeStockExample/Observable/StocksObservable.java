package ObserverPattern.NotifyMeStockExample.Observable;

import ObserverPattern.NotifyMeStockExample.Observer.NotifAlertObserver;

public interface StocksObservable {

    void add(NotifAlertObserver observer);

    void remove(NotifAlertObserver observer);
    
    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();

    void setType(String type);

    String getType();
    
}
