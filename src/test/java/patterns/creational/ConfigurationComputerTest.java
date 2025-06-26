package patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationComputerTest {

    @Test
    @DisplayName("correctly created PC with all field")
    void configurateALLComputerTest(){
        ConfigurationComputer pk = new ConfigurationComputer.Builder()
                .processor("Intel")
                .mainbroad("MSI")
                .ram(16)
                .ssd(1024)
                .videoCard("RTX 5090")
                .build();

        assertTrue(pk.getMainbroad() == "MSI");
        assertTrue(pk.getRam() == 16);
        assertEquals("Intel", pk.getProcessor());
        assertEquals(1024, pk.getSsd());
        assertEquals("RTX 5090", pk.getVideCard());
    }

    @Test
    @DisplayName("correctly create a part of computer")
    void configuratePartComputerTest(){
        ConfigurationComputer pk = new ConfigurationComputer.Builder()
                .ram(16)
                .processor("AMD Ryzen")
                .build();

        assertEquals(0, pk.getSsd(), "the default value of SSD should be 0");
        assertEquals(16, pk.getRam());
        assertEquals("AMD Ryzen", pk.getProcessor());
        assertEquals("", pk.getVideCard());
    }

    @Test
    @DisplayName("build() method should return instance of ConfigurationComputer")
    void configurateComputerClassTest(){
        ConfigurationComputer pk = new ConfigurationComputer.Builder().build();
        assertNotNull(pk);
        assertEquals(ConfigurationComputer.class, pk.getClass());

    }

}
