package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
//            // with a char buffer (read once)
//            char[] in = new char[1000];
//            int size = fileReader.read(in); // with an array, returns the file characters size
//            System.out.println(size);
//            for (char c : in) {
//                System.out.print(c);
//            }

            int i;
            while ((i = fileReader.read()) != -1) { // Basically, every time what we call .read(), he returns a the sequential character of the file
                System.out.print((char) i); // print the char value of i
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
