package academy.devdojo.javaoneforall.javacore.ZZAinternclasses.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                super.walk();
                System.out.println("Walking and talking");
            }

            public void jump() {
                System.out.println("Jumping");
            }
        };
        animal.walk();
    }
}
