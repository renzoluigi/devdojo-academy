package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalBoatService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        RentalBoatService rentavelBoatService = new RentalBoatService();
        Boat boat = rentavelBoatService.retrieveAvailableBoats();
        System.out.println("Using boat for one month...");
        rentavelBoatService.retrieveRentedBoat(boat);
    }
}
