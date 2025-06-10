package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading file from the database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file from the database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the file...");
    }
}
