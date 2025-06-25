package academy.devdojo.javaoneforall.javacore.Wnio.test;


import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestOrJavaClass extends SimpleFileVisitor<Path> {
    @NotNull
    @Override
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) {
        System.out.println(file.getFileName() + " contains: " + file.getFileName().toString().contains("Test"));
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new FindAllTestOrJavaClass());
    }
}
