package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.Reader1;
import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFileWithResources();
        readFileWithoutResources();
    }

    private static void readFileWithResources() {
        try (Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2()) { //If you want to use resources, the reference variable needs to implement the interface Closeable or Autocloseable
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithoutResources() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.text"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
