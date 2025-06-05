package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    private String name;
    private String socialSecurityNumber;
    private Address address;
    private double salary;

    public Employee(String name, String socialSecurityNumber, Address address, double salary) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.salary = salary;
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
