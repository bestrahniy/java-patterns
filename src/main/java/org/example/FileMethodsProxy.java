package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class FileMethodsProxy implements FileMethods {

    private final FileMethods fileMethods = new FileMethodsImpl();

    private final Map<Path, List<String>> cacheContentFiles = new HashMap<>();

    private final Set<Path> modifiedFiles = new HashSet<>();

    @Override
    public void writeFile(Path pathFile, String content) {
        fileMethods.writeFile(pathFile, content);
        modifiedFiles.add(pathFile);
    }

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

    public final Set<Path> getModified(){
        return modifiedFiles;
    }
}
