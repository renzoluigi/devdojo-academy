package academy.devdojo.javaoneforall.javacore.Wnio.test;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @NotNull
    @Override
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) { // What has to do when visit a directory
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @NotNull
    @Override
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) { // Called when visit a directory
        System.out.println("pre visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @NotNull
    @Override
    public FileVisitResult visitFileFailed(@NotNull Path file, @NotNull IOException exc) throws IOException { // What has to do when failed to visit a directory
        return super.visitFileFailed(file, exc);
    }

    @NotNull
    @Override
    public FileVisitResult postVisitDirectory(@NotNull Path dir, @Nullable IOException exc) { // What has to do after visit a directory
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}


public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("folder");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
