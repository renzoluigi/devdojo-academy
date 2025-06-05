package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.name = "Renzo";
        professor1.age = 18;
        professor1.gender = 'M';
        professor1.subject = "Java";

        Professor professor2 = professor1; // Allocated to the same memory address

        System.out.println(professor1); //@53d8d10a
        System.out.println(professor2); //@53d8d10a
        professor2.name = "Renzo2";
        System.out.println(professor1.name); // Renzo2
        System.out.println(professor2.name); // Renzo2
    }
}
