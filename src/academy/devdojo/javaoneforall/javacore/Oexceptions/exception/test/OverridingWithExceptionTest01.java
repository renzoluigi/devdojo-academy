package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.LoginInvalidException;
import academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (IOException | LoginInvalidException e) {
            e.printStackTrace();
        }

        Employee employee = new Employee();
        try {
            employee.save();
        } catch (FileNotFoundException e) { // The original method throws IOException, but this throws the subclass of this
            throw new RuntimeException(e);
        }
    }
}
