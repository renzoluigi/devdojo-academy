package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Renzo");
        Consumer consumer2 = new Consumer("DevDojo");

        Manga manga1 = new Manga(2L, "Pokemon", 3D, 4);
        Manga manga2 = new Manga(4L, "Dragon Ball Z", 2.75, 9);
        Manga manga3 = new Manga(1L, "Hellsing Ultimate", 4.99, 0);
        Manga manga4 = new Manga(6L, "Berserk", 6.99, 2);
        Manga manga5 = new Manga(14L, "Attack on Titan", 3.99, 0);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga3);
        consumerMangaMap.put(consumer2, manga2);

        for (Map.Entry<Consumer, Manga> consumerMangaEntry : consumerMangaMap.entrySet()) {
            System.out.println(consumerMangaEntry.getKey().getName() + ": " + consumerMangaEntry.getValue().getName());
        }
    }
}
