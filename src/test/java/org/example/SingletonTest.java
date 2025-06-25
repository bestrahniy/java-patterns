package org.example;


import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertTrue;

public class SingletonTest {

    @Test
    void singletonTest(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertTrue(instance2 == instance1);
    }
}
