package observer;

import observable.StocksObservable;

public class EmailAlertObserver extends NotificationObserver {
    String userEmail;
    @Override
    public void update() {
        System.out.println("Email alert for userEmail : "+ userEmail);
    }
    public EmailAlertObserver(String userName, StocksObservable Observable){
        this.userEmail = userName;
        this.stocksObservable = Observable;
        this.stocksObservable.add(this);
    }
}
