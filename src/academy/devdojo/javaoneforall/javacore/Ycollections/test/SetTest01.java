package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // Unique elements (based on equals of the class), ordered by hash
        // LinkedHashSet -> same logic, but ordered by insertion position
        mangas.add(new Manga(2L, "Pokemon", 3D));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.75));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 4.99));
        mangas.add(new Manga(2L, "Berserk", 6.99));
        mangas.add(new Manga(14L, "Attack on Titan", 3.99));
        mangas.add(new Manga(2L, "Pokemon", 3D));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
