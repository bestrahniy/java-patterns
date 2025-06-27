package patterns.structural;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * basic implementation of working with file
 */
public class FileMethodsImpl implements FileMethods {

    /**
     * read all logs from file and show their to screen
     * @param pathFile path file
     * @return list logs
     * @throws IOException open/close exception
     */
    @Override
    public List<String> readFile(Path pathFile) throws IOException {
        List<String> lines = Files.readAllLines(pathFile);
        for (String line : lines) {
            System.out.println(line);
        }
        return lines;
    }

    /**
     * write one logs in file
     * @param pathFile path file
     * @param content content which need write in file
     */
    @Override
    public void writeFile(Path pathFile, String content) {
        try {
            Files.write(pathFile, content.getBytes());
        } catch (IOException exception) {
            System.out.println("error writing file " + exception.getMessage());
        }
    }

}
