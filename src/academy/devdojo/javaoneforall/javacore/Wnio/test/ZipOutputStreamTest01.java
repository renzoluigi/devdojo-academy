package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("folder/file.zip"); // Where the files will be
        Path filesToZip = Paths.get("folder/subfolder1/subsubfolder1"); // Files inside this folder

        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try (
            ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip)); // To create zip files on the path
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip) // To walk for each file
        ) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); // An entry for a zip file
                zipStream.putNextEntry(zipEntry); // Put on the next entry
                Files.copy(file, zipStream); // To copy the same content
                zipStream.closeEntry(); // Close the ENTRY, not the zipStream
            }
            System.out.println("File created with success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
