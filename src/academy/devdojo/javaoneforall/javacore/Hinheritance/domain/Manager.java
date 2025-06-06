package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Manager extends Employee { // -> specialization
    private String department;
    static{
        System.out.println("Inside static init block from Manager (subclass)");
    }
    {
        System.out.println("Inside init block 1 from Manager (subclass)");
    }
    {
        System.out.println("Inside init block 2 from Manager (subclass)");
    }

    public Manager(String name, String socialSecurityNumber, Address address, double salary, String department) {
        super(name, socialSecurityNumber, address, salary); // As this(), call to 'super()' must be first statement in constructor body
        this.department = department;
        System.out.println("Inside Manager constructor (subclass)");
    }

    @Override
    public String toString() {
        return super.toString() +
                "department='" + department + '\'' +
                '}';
    }

    public void paymentReport() {
        System.out.println("The employee " + name + " from the departament " + department + " has been paid");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
