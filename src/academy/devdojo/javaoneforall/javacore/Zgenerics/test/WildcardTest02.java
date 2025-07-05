package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        dogs.add(new Dog());
        System.out.println(dogs);
//        printConsultation(dogs);
//        printConsultation(cats);
    }

    // Type erasure -> On compiling Java doesn't know what the type is your Collection
    // (you need to pass the exactly class what he's looking for)
    public static void printConsultation(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consultation();
        }
        animals.add(new Cat()); // At that scope, the compiler already knows what the List are waiting for
    }
}
