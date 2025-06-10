package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover { // You can have multiple interfaces implemented at the same time
    @Override
    public void load() { // The access modifier of an implement method needs to be public
        System.out.println("Loading data from the database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the class DatabaseLoader");
    }
}

// Access modifier order:
// private -> default (package access modifier) -> protected -> public
// You can override and make less restrictive