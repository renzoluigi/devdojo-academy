package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator()); // The class needs to have comparable, or you can add a comparator
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(2L, "Pokemon", 3D, 5));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.75, 3));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 4.99, 0));
        mangas.add(new Manga(6L, "Berserk", 2.99, 2));
        mangas.add(new Manga(14L, "Attack on Titan", 3.99, 8));
        mangas.add(new Manga(144L, "Attack on Titan231", 3.99, 0)); // It was supposed to be in set, but compareTo only considers id

        for (Manga manga : mangas.descendingSet()) { // To invert order
            System.out.println(manga); // -> Ordered by id (compareTo)
        }

        System.out.println("----------");

        Manga yuyu = new Manga(5L, "YuYu Hakusho", 2.99, 4);
        // Comparison methods (based on comparator), only the first one
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("----------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // Returns and remove the first one
        System.out.println(mangas.size());
    }
}
