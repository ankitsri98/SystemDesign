package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;
/*
Here all the functionality is attached to the product for which we developed notification system

It is important to tell which product it is while updating observer  (as user will get notified for that particular product only)

User identity that is email/username/number is required depending upon the which observer option we select

 */
public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        observable.inStockMessage(); // we can just use this method to show which product got stocked
        // no need to check which instance it is .
        sendMobileAlert(userName, "Product is in stock hurry up!");
    }

    private void sendMobileAlert(String userName, String msg) {
        System.out.println("Mobile alert sent to: " + userName);
    }
}
