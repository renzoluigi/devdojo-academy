package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

// The first concrete class must provide implementation of the abstract classes he is inheriting
public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
    }

    @Override
    public void calculateBonusSalary() {
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
