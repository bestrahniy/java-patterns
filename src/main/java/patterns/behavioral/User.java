package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * User class, which is observer.
 * get and store notifications.
 * @author Бобков Илья
 */
public class User implements NotificationObserver {

    private String name;

    private final List<String> notifications = new ArrayList<>();

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

    public List<String> getNotification() {
        return notifications;
    }
}
