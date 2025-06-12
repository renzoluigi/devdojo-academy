package academy.devdojo.javaoneforall.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConnection());
    }

    private static String openConnection() {
        try {
            System.out.println("Opening connection");
            System.out.println("Writing to the database");
            if (true) {
                throw new RuntimeException();
            }
            return "connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // ALWAYS will be executed
            System.out.println("Close");
        }
        return "not connected";
    }
}
