package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consultation();
}

class Dog extends Animal {
    @Override
    public void consultation() {
        System.out.println("Consulting little dog");
    }
}

class Cat extends Animal {
    @Override
    public void consultation() {
        System.out.println("Consulting cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printConsultation(dogs);
        printConsultation(cats);

        Animal[] animals = {new Dog(), new Cat()};
        printConsultation(animals);
    }

    public static void printConsultation(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consultation();
        }
    }
}
