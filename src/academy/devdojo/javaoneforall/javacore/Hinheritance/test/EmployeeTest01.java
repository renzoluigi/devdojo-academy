package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Address address = new Address("12th ave", "12233");
        Employee employee = new Employee("Renzo", "0123", address, 2193.32);
        System.out.println(employee);

        Manager manager = new Manager("Sofia", "0123", address, 2193.32, "Social");
        System.out.println(manager);
        manager.paymentReport();
    }
}
