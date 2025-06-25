/**
 * Classes are presented to demonstrate the Observer pattern.
 */
package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * this is manager notification.
 * that manage the list of observer and notify them about new notifications.
 */
public class NotificationManager implements NotificationObject {

    /**
     * the list of observer.
     */
    private final List<User> users = new ArrayList<>();

    /**
     * create a new notification and notify about all observer.
     * @param notification massage of notification.
     */
    @Override
    public void createNotification(final String notification) {
        System.out.printf("Создано уведомление: %s", notification);
        notifyObserver(notification);
    }

    /**
     * register a new observer in list.
     * @param user new observer.
     */
    @Override
    public void registerObserver(final User user) {
        users.add(user);
    }

    /**
     * remove observer from list.
     * @param user observer for remove.
     */
    @Override
    public void removeObserver(final User user) {
        users.remove(user);
    }

    /**
     * notify all registered observer about new notification.
     * @param notification a massage of notification.
     */
    @Override
    public void notifyObserver(final String notification) {
        for (User user : users) {
            user.update(notification);
        }
    }

    /**
     * return count registered observer.
     * @return count of observer.
     */
    public int getObserversCnt() {
        return users.size();
    }

}
