package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6); // LinkedList
        mangas.add(new Manga(2L, "Pokemon", 3D, 4));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.75, 9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 4.99, 0));
        mangas.add(new Manga(6L, "Berserk", 6.99, 2));
        mangas.add(new Manga(14L, "Attack on Titan", 3.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getAmount() == 0) {
                mangaIterator.remove(); // A safe way to remove
            }
        }
        System.out.println(mangas);

        // Functional programming
        mangas.removeIf(manga -> manga.getAmount() == 0);
        System.out.println(mangas);

//        for (Manga manga : mangas) {
//            if (manga.getAmount() == 0) {
//                mangas.remove(manga); // -> ConcurrentModificationException
//            }
//        }
    }
}
