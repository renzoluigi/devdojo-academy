package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;
    static{
        System.out.println("Inside static init block from Employee (superclass)");
    }
    {
        System.out.println("Inside init block 1 from Employee (superclass)");
    }
    {
        System.out.println("Inside init block 2 from Employee (superclass)");
    }

    public Employee(String name, String socialSecurityNumber, Address address, double salary) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.salary = salary;
        System.out.println("Inside Employee constructor (superclass)");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
