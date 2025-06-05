package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Manager extends Employee { // -> especialization
    private String department;

    public Manager(String name, String socialSecurityNumber, Address address, double salary, String department) {
        super(name, socialSecurityNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
