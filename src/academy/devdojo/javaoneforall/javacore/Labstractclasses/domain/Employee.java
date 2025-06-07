package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

// Can't be instantiated
public abstract class Employee { // Works like a template, he is created to be inherited
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
