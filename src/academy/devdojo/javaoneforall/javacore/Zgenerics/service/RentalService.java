package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> { // -> type
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for available objects");
        T t = availableObjects.remove(0);
        System.out.println("Hiring object: " + t);
        System.out.println("Available objects to hire: ");
        System.out.println(availableObjects);
        return t;
    }

    public void retrieveRentedObject(T t) {
        System.out.println("Retrieving object: " + t);
        availableObjects.add(t);
        System.out.println("Available objects to hire: ");
        System.out.println(availableObjects);
    }
}
