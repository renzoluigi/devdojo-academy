package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        // Folder creation
        File folder = new File("folder");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Created " + isFolderCreated);

        File file = new File(folder, "file.txt"); // Or pass only the absolute path
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created " + isFileCreated);

        File fileRenamed = new File(folder, "file_renamed.txt"); // You need to pass the same absolute path/folder
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("File renamed " + isFileRenamed);

        File folderRenamed = new File("folder_renamed");
        boolean isFolderRenamed = folder.renameTo(folderRenamed);
        System.out.println("Folder renamed" + isFolderRenamed);
    }
}
