package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Computer extends Product {
    private static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return price * TAX_PERCENTAGE;
    }
}
