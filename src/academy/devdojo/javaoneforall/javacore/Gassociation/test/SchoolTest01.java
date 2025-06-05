package academy.devdojo.javaoneforall.javacore.Gassociation.test;


import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor[] professors = {new Professor("Renzo"), new Professor("Sofia"), new Professor("Denize")};
        School devDojo = new School("DevDojo", professors);

        System.out.println(devDojo);
    }
}
