package academy.devdojo.javaoneforall.javacore.Wnio.test;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @NotNull
    @Override
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) { // What has to do when visit a directory
        if (file.toString().endsWith("java")) System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListJavaFiles()); // After find a file in the file tree, he calls visitFile
    }
}
