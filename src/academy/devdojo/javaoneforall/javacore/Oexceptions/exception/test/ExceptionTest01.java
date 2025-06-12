package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        customFileCreator();
    }

    private static void customFileCreator() {
        File file = new File("folder\\test.text"); // Just an object
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated );
        } catch (IOException e) {
            e.printStackTrace(); // The history of the exception
            throw new RuntimeException("ERROR! Fail when tried to create file.");
        }
        System.out.println("Outside custom file creator");
    }
}
