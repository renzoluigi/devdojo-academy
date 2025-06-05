package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Renzo");
        person.setAge(18);
        System.out.println(person);
    }
}
