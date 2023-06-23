package observer;

import observable.StocksObservable;

public class MobileAlertObserver extends NotificationObserver {
    String userName;
    @Override
    public void update() {
        System.out.println("Mobile alert for userName : " + userName);
    }
    public MobileAlertObserver(String userName, StocksObservable Observable){
        this.userName = userName;
        this.stocksObservable = Observable;
        this.stocksObservable.add(this);
    }
}
