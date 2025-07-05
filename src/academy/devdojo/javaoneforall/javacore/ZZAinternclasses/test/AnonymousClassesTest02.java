package academy.devdojo.javaoneforall.javacore.ZZAinternclasses.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Boatee"), new Boat("Ship"), new Boat("Yacht")));

        boats.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boats);
    }
}
