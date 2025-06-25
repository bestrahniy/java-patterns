/**
 * Classes are presented to demonstrate the Observer pattern.
 */
package org.example;

/**
 * this interface for the observed object.
 * defines the contract for manage observer and notify they.
 */
public interface NotificationObject {

    /**
     * create a new notification and notify all observer.
     * @param notification massage of notification.
     */
    void createNotification(String notification);

    /**
     * remove one observer from list.
     * @param user observer for remove.
     */
    void removeObserver(User user);

    /**
     * register new observer.
     * @param user new observer.
     */
    void registerObserver(User user);

    /**
     * notify all observer about new notification.
     * @param notification massage of notification.
     */
    void notifyObserver(String notification);

}
