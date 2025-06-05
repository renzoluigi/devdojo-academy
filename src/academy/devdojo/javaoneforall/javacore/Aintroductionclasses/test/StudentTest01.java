package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) { // An object is an instance of a class
        Student student = new Student(); // Object creation (reference verbal + object)
        student.name = "Renzo";
        student.age = 18;
        student.gender = 'M';
        System.out.println(student);
    }
}
