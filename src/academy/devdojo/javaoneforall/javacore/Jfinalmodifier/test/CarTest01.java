package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT); // Must be called by the class, not by the object
        System.out.println(car.BUYER);
        // Car.SPEED_LIMIT = 130; // final can't be reassigned
        car.BUYER.setName("Civic 2025");
        System.out.println(car.BUYER);
    }
}
