package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        RentalService<Boat> availableBoats = new RentalService<>(new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht"), new Boat("Ship"))));
        Boat boat = availableBoats.retrieveAvailableObject();
        System.out.println("Using boat for one month...");
        availableBoats.retrieveRentedObject(boat);

        System.out.println("-----------");

        RentalService<Car> availableCars = new RentalService<>(new ArrayList<>(List.of(new Car("BYD"), new Car("Mercedes"), new Car("BMW"))));
        Car car = availableCars.retrieveAvailableObject();
        System.out.println("Using car for one month...");
        availableCars   .retrieveRentedObject(car);
    }
}
