package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileMethods {

    List<String> readFile(Path pathFile) throws IOException;

    void writeFile(Path pathFile, String content);

}
