package patterns.structural;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * interface for work with file system
 * @author Бобков Илья
 */
public interface FileMethods {

    /**
     * read logs from file
     * @param pathFile path file
     * @return list of logs from file
     * @throws IOException open/close exception
     */
    List<String> readFile(Path pathFile) throws IOException;

    /**
     * write logs in file
     * @param pathFile path file
     * @param content content which need write in file
     */
    void writeFile(Path pathFile, String content);

}
