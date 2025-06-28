package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaByPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L, "Pokemon", 3D));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.75));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 4.99));
        mangas.add(new Manga(6L, "Berserk", 6.99));
        mangas.add(new Manga(14L, "Attack on Titan", 3.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------");

        mangas.sort(new MangaByNameComparator()); // or Collections.sort(mangas, new MangaByNameComparator())
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------");

        mangas.sort(new MangaByPriceComparator()); // or Collections.sort(mangas, new MangaByPriceComparator())
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
