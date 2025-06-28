package academy.devdojo.javaoneforall.javacore.XSerialization.test;

import academy.devdojo.javaoneforall.javacore.XSerialization.domain.Class;
import academy.devdojo.javaoneforall.javacore.XSerialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Renzo", "123456");
        Class aClass = new Class("Mathematics");
        student.setaClass(aClass);
        serialize(student);
        desearialize();
    }

    private static void serialize(Student student) { // To persist an object in a file
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) { // To work with objects
            oos.writeObject(student); // To write the object from a type student
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desearialize() { // To read the object persisted
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject(); // Cast to object (He doesn't know what class is it)
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
