package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileMethodsImpl implements FileMethods {

    @Override
    public List<String> readFile(Path pathFile) throws IOException {
        List<String> lines = Files.readAllLines(pathFile);
        for (String line : lines) {
            System.out.println(line);
        }
        return lines;
    }

    @Override
    public void writeFile(Path pathFile, String content) {
        try {
            Files.write(pathFile, content.getBytes());
        } catch (IOException exception) {
            System.out.println("error writing file " + exception.getMessage());
        }
    }

}
