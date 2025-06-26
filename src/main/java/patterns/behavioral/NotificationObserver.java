package patterns.behavioral;

/**
 * interface that all users should implement.
 * @author Бобков Илья
 */
public interface NotificationObserver {
    /**
     * the method is called by observer.
     * @param notification massage about change the state.
     */
    void update(String notification);

}
