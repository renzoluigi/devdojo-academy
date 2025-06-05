package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        StudentPrinter printer = new StudentPrinter();

        student1.name = "Sofia";
        student1.age = (int) (Math.random() * 100);
        student1.gender = 'F';

        student2.name = "Renzo";
        student2.age = (int) (Math.random() * 100);
        student2.gender = 'M';

        printer.printStudent(student1);
        printer.printStudent(student2);
    }
}
