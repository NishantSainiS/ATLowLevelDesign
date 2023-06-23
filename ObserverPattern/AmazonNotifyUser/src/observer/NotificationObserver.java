package observer;

import observable.StocksObservable;

public abstract class NotificationObserver {
    protected StocksObservable stocksObservable;
    public abstract void update();
}
