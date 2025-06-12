package academy.devdojo.javaoneforall.javacore.Oexceptions.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IOException { // The main can throw the IOException, and the division method doesn't need to be handled, but if the exception reaches at him on the stack, he will crash
        try {
            System.out.println(division(1, 0));
        } catch (IllegalArgumentException e) { // Runtime Exceptions don't need to be handled
            e.printStackTrace();
        }
        System.out.println("Finished successfully.");
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */
    private static int division(int a, int b) throws IOException { // If throws a checked exception, the method needs to handle this with try/catch
        if (b == 0) {
            throw new IllegalArgumentException("The second argument can't be zero");
        }
        return a / b;
    }
}
