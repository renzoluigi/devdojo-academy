package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    private static final double TAX_PERCENTAGE = 0.21;
    private double weight;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENTAGE;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
