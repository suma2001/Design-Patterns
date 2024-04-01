package ObserverPattern.NotifyMeStockExample.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.NotifyMeStockExample.Observer.NotifAlertObserver;

public class iPhoneObservable implements StocksObservable {

    private List<NotifAlertObserver> observers = new ArrayList<>();
    private int stockCount;
    private String type;

    public iPhoneObservable(String type, int stockCount) {
        this.type = type;
        this.stockCount = stockCount;
    }

    @Override
    public void add(NotifAlertObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(NotifAlertObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotifAlertObserver obs: this.observers) {
            obs.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        this.stockCount += newStockCount;
        notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
    
}
