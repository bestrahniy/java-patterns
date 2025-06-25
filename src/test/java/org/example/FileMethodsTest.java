package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileMethodsTest {

    @TempDir
    Path dirTest;

    private Path testFile1;

    @BeforeEach
    void initTestFile(){
        testFile1 = dirTest.resolve("testFile1.txt");
    }

    @AfterEach
    void deleteAllFiles() throws IOException {
        Files.deleteIfExists(testFile1);
    }

    @Test
    @DisplayName("Write and read line in file should are correctly")
    void writeReadFileTest() throws IOException {
        FileMethodsImpl fileMethods = new FileMethodsImpl();
        fileMethods.writeFile(testFile1, "Hello proxy 1 Test File");
        assertTrue(Files.exists(testFile1));

        List<String> lines = fileMethods.readFile(testFile1);
        assertEquals("Hello proxy 1 Test File", lines.get(0));
    }

    @Test
    @DisplayName("First read file should implemented by FileMethodsImplement and other should be cache")
    void firstOtherReadFileTest() throws IOException {
        FileMethodsProxy proxy = new FileMethodsProxy();
        proxy.writeFile(testFile1, "Hello test proxy");

        // before first request the data is not in the cache
        assertTrue(proxy.getModified().contains(testFile1));

        proxy.readFile(testFile1);
        proxy.readFile(testFile1);

        // all subsequent request the data is in cache
        assertFalse(proxy.getModified().contains(testFile1));
    }
}
