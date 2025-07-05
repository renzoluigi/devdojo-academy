package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        RentalCarService rentavelCarService = new RentalCarService();
        Car car = rentavelCarService.retrieveAvailableCars();
        System.out.println("Using car for one month...");
        rentavelCarService.retrieveRentedCar(car);
    }
}
