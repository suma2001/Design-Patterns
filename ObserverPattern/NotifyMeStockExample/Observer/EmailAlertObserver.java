package ObserverPattern.NotifyMeStockExample.Observer;

import ObserverPattern.NotifyMeStockExample.Observable.StocksObservable;

public class EmailAlertObserver implements NotifAlertObserver {
    
    String email;
    StocksObservable observable;

    public EmailAlertObserver(StocksObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail(email);
    }

    private void sendMail(String email) {
        System.out.println("Email sent to: " + email + ". The " + observable.getType() + " stock is up with count: " + observable.getStockCount());
    }
}
