package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder_renamed/new_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);// The path and the type of return

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        System.out.println("Creation time:" + creationTime);
        System.out.println("Last access time: " + lastAccessTime);
        System.out.println("Last modified time: " + lastModifiedTime);

        System.out.println("-----------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class); // Have permission to set attributes
        FileTime newLastAccessTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newLastAccessTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime(); // Rereading the file to return updated attributes
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last access time: " + lastAccessTime);
        System.out.println("Last modified time: " + lastModifiedTime);
    }
}
