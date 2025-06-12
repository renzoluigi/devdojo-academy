package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            customFileCreator();
        } catch (IOException e) {
            //sendEmailToDev();
            System.out.println("ERROR! A email has been sent to the support team.");
        }
    }

    private static void customFileCreator() throws IOException {
        File file = new File("folder\\test.text"); // Just an object
        boolean isCreated = file.createNewFile();
        System.out.println("File created: " + isCreated);
        System.out.println("Outside custom file creator");
    }
}

// When we do this, the responsibility of the handle is of who is calling
// It is better when the method is public, because the method can be handled by different ways