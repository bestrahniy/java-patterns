/**
 * Classes are presented to demonstrate the Observer pattern.
 */
package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * User class, which is observer.
 * get and store notifications.
 */
public class User implements NotificationObserver {

    /**
     * name of user.
     */
    private String name;

    /**
     * list of notifications.
     */
    private final List<String> notifications = new ArrayList<>();

    /**
     * Constructor for creating user.
     * @param userName User name.
     */
    public User(final String userName) {
        this.name = userName;
    }

    /**
     * update list of notifications and displays a new notification.
     * @param notification massage of notification.
     */
    @Override
    public void update(final String notification) {
        notifications.add(notification);
        System.out.printf("Пользователь %s получил уведомление: %s",
                name, notification);
    }

    /**
     * displays all notifications on the display.
     */
    public void printAllNotification() {
        notifications.forEach(System.out::println);
    }

    /**
     * return list of all notifications.
     * @return list of notification.
     */
    public List<String> getNotification() {
        return notifications;
    }
}
