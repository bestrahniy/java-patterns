package patterns.structural;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * proxy class which store cache and interacts with their
 * @author Бобков Илья
 */
public class FileMethodsProxy implements FileMethods {

    private final FileMethods fileMethods = new FileMethodsImpl();

    private final Map<Path, List<String>> cacheContentFiles = new HashMap<>();

    private final Set<Path> modifiedFiles = new HashSet<>();

    /**
     * write new data to file
     * @param pathFile file path with logs
     * @param content content which need add to file
     */
    @Override
    public void writeFile(Path pathFile, String content) {
        fileMethods.writeFile(pathFile, content);
        modifiedFiles.add(pathFile);
    }

    /**
     * reads data from the cache, if file has not been modified
     * else reads data from file and adds file to the cache
     * @param pathFile file path with logs
     * @return string logs
     * @throws IOException open/close exception
     */
    @Override
    public List<String> readFile(Path pathFile) throws IOException {

        if (modifiedFiles.contains(pathFile)) {
            cacheContentFiles.remove(pathFile);
            modifiedFiles.remove(pathFile);
        }

        if (cacheContentFiles.containsKey(pathFile)) {
            return cacheContentFiles.get(pathFile);
        } else {
            List<String> lines = fileMethods.readFile(pathFile);
            cacheContentFiles.put(pathFile, lines);
            return lines;
        }
    }

    public final Set<Path> getModified() {
        return modifiedFiles;
    }

}
