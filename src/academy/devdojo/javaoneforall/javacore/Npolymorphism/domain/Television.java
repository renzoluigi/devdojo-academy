package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Television extends Product {
    public static final int TAX_PERCENTAGE = 10;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return price * TAX_PERCENTAGE;
    }
}
