import observable.IPhone;
import observable.StocksObservable;
import observer.EmailAlertObserver;
import observer.MobileAlertObserver;
import observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StocksObservable IPhone = new IPhone();

        NotificationObserver mobileUser1 = new MobileAlertObserver("user1@gmail.com",IPhone);
        NotificationObserver mobileUser2 = new MobileAlertObserver("user2@gmail.com",IPhone);
        NotificationObserver email = new EmailAlertObserver("user3@gmail.com",IPhone);

        IPhone.addStockCount(5);
        IPhone.removeStockCount(4);
        IPhone.removeStockCount(2);
        IPhone.addStockCount(10);


    }
}