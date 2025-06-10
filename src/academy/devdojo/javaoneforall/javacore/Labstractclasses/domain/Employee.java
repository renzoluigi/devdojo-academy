package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

// Can't be instantiated
// The first concrete class must provide implementation of the abstract classes he is inheriting
public abstract class Employee extends Person { // Works like a template, he is created to be inherited
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    public abstract void calculateBonusSalary();

    public final void delete() {
        System.out.println("Employee deleted");
    }

    public static void staticMethod() {
        System.out.println("Inside the static method in the abstract class Employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
