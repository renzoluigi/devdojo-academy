package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write("A simple test to write in the file");
            bufferedWriter.newLine(); // As we see before, this is better, because \n isn't recognized by some OS
            bufferedWriter.write("And this is another line of the test");
            bufferedWriter.newLine();
            bufferedWriter.write("ABCD");
            bufferedWriter.flush();
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
