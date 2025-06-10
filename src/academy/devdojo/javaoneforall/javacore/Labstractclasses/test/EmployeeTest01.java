package academy.devdojo.javaoneforall.javacore.Labstractclasses.test;

import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Developer;
import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Renzo", 20000);
        System.out.println(manager);

        Developer developer = new Developer("Renzo", 10000);
        System.out.println(developer);
        developer.calculateBonusSalary();

        developer.delete();
        Developer.staticMethod();
    }
}
