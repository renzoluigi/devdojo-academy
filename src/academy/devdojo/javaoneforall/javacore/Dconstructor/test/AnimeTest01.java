package academy.devdojo.javaoneforall.javacore.Dconstructor.test;

import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Inazuma Eleven", "Sports", 100, true);
        Anime anime2 = new Anime("Naruto", "Shonen", 700, false, "Ghibli");
        System.out.println(anime1);
        System.out.println(anime2);
    }
}
