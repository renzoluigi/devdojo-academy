package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {
    @Override
    public void save() throws NullPointerException, ArithmeticException, FileNotFoundException { // Can't throw checked exceptions different of FileNotFoundException or LoginInvalidException (same checked exceptions of the superclass)
    }
}
