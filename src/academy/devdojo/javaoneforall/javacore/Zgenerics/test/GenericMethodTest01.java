package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.Comparator;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> listOfBoat = createArrayWithAnObject(new Boat("Boatee"));
        System.out.println(listOfBoat);
    }

    private static <T> List<T> createArrayWithAnObject(T t) {
        List<T> list = List.of(t);
        return list;
    }
}

class ThreeAttributes<T extends Comparable<T>,X extends Comparator<X>,I> {
    private T t;
    private X x;
    private I i;

    public ThreeAttributes(T t, X x, I i) {
        this.t = t;
        this.x = x;
        this.i = i;
    }
}
