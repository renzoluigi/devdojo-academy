package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            // If the file already exists, throws an exception
            Path folderDirectory = Files.createDirectory(folderPath); // Can't create more than 1 directory (with subfolders)
        }

        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath); // Can create one or multiple directories

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path fileDirectory = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); // This method support replacement (doesn't need to verify if exists)
    }
}
