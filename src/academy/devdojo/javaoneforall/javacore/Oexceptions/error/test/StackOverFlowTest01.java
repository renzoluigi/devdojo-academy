package academy.devdojo.javaoneforall.javacore.Oexceptions.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        System.out.println("Hello");
        recursion();
    }

    private static void recursion() {
        recursion();
    }
}
// Stack Overflow -> JVM can't allocate enough memory for the stack