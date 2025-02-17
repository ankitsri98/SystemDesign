package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;
/*

Any product on amazon which is out of stock and has notification feature will be able to implement this interface

And whenever it is "In Stock" notification to its observer ( of only this particular Item ) will be sent

 */
public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
    public void inStockMessage();
}
