package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificationTest {

    private NotificationManager notificationObject;

    private User user1;

    private User user2;

    @BeforeEach
    void init(){
        notificationObject = new NotificationManager();
        user1 = new User("Ilya");
        user2 = new User("Masha");

        notificationObject.registerObserver(user1);
        notificationObject.registerObserver(user2);
    }

    @Test
    void createRemoveObserverTest(){

        assertEquals(2, notificationObject.getObserversCnt());

        notificationObject.removeObserver(user1);

        assertTrue(notificationObject.getObserversCnt() == 1);
    }

    @Test
    void AllObserversShouldContainsNotify(){
        notificationObject.createNotification("test notification");
        assertEquals("test notification", user2.getNotification().get(0));
    }
}
