package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 130; // You have to initialize this attribute to be a constant
    public final Buyer BUYER = new Buyer();

    public final void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
