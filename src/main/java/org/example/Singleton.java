package org.example;

/**
 * class that defines singleton pattern
 * this method is thread safe and fast
 * @author Бобков Илья
 */
public final class Singleton {

    private static Singleton instance;

    private Singleton() {}

    /**
     * method returns new ar already existing object
     * @return new or already existing object
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
