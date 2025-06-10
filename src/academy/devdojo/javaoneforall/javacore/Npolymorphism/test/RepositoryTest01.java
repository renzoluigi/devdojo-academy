package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) { // Interface Oriented Programming
        Repository repository = new InMemoryRepositoryService();
        repository.save();
        repository = new DatabaseRepositoryService();
        repository.save();
    }
}
