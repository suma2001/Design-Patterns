package ObserverPattern.NotifyMeStockExample.Observer;

import ObserverPattern.NotifyMeStockExample.Observable.StocksObservable;

public class MobileAlertObserver implements NotifAlertObserver {
    
    String mobile;
    StocksObservable observable;

    public MobileAlertObserver(StocksObservable observable, String mobile) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        sendMsgOnMobile(mobile);
    }

    private void sendMsgOnMobile(String mobile) {
        System.out.println("Msg sent to: " + mobile + ". The " + observable.getType() + " stock is up with count: " + observable.getStockCount());
    }
}
