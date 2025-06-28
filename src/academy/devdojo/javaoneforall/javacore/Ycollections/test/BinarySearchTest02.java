package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByPriceComparator mangaByPriceComparator = new MangaByPriceComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L, "Pokemon", 3D));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.75));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 4.99));
        mangas.add(new Manga(6L, "Berserk", 6.99));
        mangas.add(new Manga(14L, "Attack on Titan", 3.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(14L, "Attack on Titan", 3.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

        System.out.println("----------");

        mangas.sort(mangaByPriceComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByPriceComparator)); // With a custom comparator

//        Arrays.binarySearch() // need to be sorted too
    }
}
