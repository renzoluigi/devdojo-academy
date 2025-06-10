package academy.devdojo.javaoneforall.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("The second parameter can't be zero.");
        }
        return a / b;
    }
}
