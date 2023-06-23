package observable;

import observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements StocksObservable{
    List<NotificationObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void addStockCount(int count) {
        if(stockCount==0){
            stockCount = count;
            notifyAllObserver();
        }else{
            stockCount=count;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public boolean removeStockCount(int sellCount) {
        if(stockCount>=sellCount){
            stockCount-=sellCount;
            return true;
        }else{
            return false;
        }
    }
}
