package observable;

import observer.NotificationObserver;

public interface StocksObservable {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);

    public void notifyAllObserver();
    public void addStockCount(int count);
    public int getStockCount();
    public boolean removeStockCount(int sellcount);

}
