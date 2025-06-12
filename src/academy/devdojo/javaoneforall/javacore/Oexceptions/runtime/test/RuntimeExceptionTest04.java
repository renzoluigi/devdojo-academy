package academy.devdojo.javaoneforall.javacore.Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException is a subclass of IndexOutOfBoundsException
            throw new RuntimeException();
        } catch (IndexOutOfBoundsException e) { // If he is in the multi catch of ArrayIndexOutOfBoundsException, we have a compiler error
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Inside NullPointerException");
        } catch (RuntimeException e) { // Father of all (if anyone doesn't work, they will work)
            System.out.println("Inside RuntimeException");
        }

        try {
           mayThrowException();
        } catch (SQLException  | IOException e) { // Multi catch
//            e = new RuntimeException(); You can't do this because he is final (if is a multi catch)
            e.printStackTrace();
        } catch (Exception e) {
            e = new RuntimeException(); // Can create a new object to the variable e
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {}
}
