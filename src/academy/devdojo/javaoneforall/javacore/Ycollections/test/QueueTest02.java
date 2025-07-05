package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaByPriceComparator().reversed()); // to descending price order
        mangaQueue.add(new Manga(2L, "Pokemon", 3D, 4));
        mangaQueue.add(new Manga(4L, "Dragon Ball Z", 2.75, 9));
        mangaQueue.add(new Manga(1L, "Hellsing Ultimate", 4.99, 0));
        mangaQueue.add(new Manga(6L, "Berserk", 6.99, 2));
        mangaQueue.add(new Manga(14L, "Attack on Titan", 3.99, 0));

        while (!mangaQueue.isEmpty()) {
            System.out.println(mangaQueue.poll());
        }
    }
}
