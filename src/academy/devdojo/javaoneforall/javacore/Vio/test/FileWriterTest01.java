package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) { // Auto close
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) { // Auto close (try with resources), automatically create the file and (true) append the new values without rewrite
            fileWriter.write("A simple test to write in the file\nAnd this is another line of the test\nABCD\n"); // \n is not recommended, because some OS not recognize this
            fileWriter.flush(); // Before close, throw the things inside the buffer away (if loading isn't complete)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


