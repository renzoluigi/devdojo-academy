package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BYD"), new Car("Mercedes"), new Car("BMW"))); // simulating a db

    public Car retrieveAvailableCars() {
        System.out.println("Searching for available cars");
        Car car = availableCars.remove(0);
        System.out.println("Hiring car: " + car);
        System.out.println("Available cars to hire: ");
        System.out.println(availableCars);
        return car;
    }

    public void retrieveRentedCar(Car car) {
        System.out.println("Retrieving car: " + car);
        availableCars.add(car);
        System.out.println("Available cars to hire: ");
        System.out.println(availableCars);
    }
}
