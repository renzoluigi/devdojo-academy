package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader { // Works like a contract
    public static final int MAX_DATA_SIZE = 10; // ALL attributes in the interface context are public static and final

    public abstract void load();// It is public and abstract by default

    public default void checkPermission() { // Classes do not need to implement this method; if they want to change the behavior, they can override it
        System.out.println("Checking permission general...");
    }

    public static void retrieveMaxDataSize() { // Can't be inherited
        System.out.println("Inside retrieveMaxDataSize in the interface");
    }
}

// Interfaces -> Implements
// The implementation of the methods needs to be in the first concrete class
// You can have multiple interfaces implemented at the same time