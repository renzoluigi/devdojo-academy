package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class RentalBoatService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht"), new Boat("Ship"))); // simulating a db

    public Boat retrieveAvailableBoats() {
        System.out.println("Searching for available boats");
        Boat boat = availableBoats.remove(0);
        System.out.println("Hiring boat: " + boat);
        System.out.println("Available boats to hire: ");
        System.out.println(availableBoats);
        return boat;
    }

    public void retrieveRentedBoat(Boat boat) {
        System.out.println("Retrieving boat: " + boat);
        availableBoats.add(boat);
        System.out.println("Available boats to hire: ");
        System.out.println(availableBoats);
    }
}
