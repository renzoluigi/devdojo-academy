package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void printStudent(Student student) {
        student.name = "Harry";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
