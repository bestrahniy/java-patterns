/**
 * Classes are presented to demonstrate the Observer pattern.
 */
package org.example;

/**
 * interface that all users should implement.
 */
public interface NotificationObserver {
    /**
     * the method is called by observer.
     * @param notification massage about change the state.
     */
    void update(String notification);

}
