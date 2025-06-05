package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
