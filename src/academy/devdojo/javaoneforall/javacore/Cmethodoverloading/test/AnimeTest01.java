package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        anime1.init("Naruto", "shonen", 700);
        anime2.init("Naruto", "shonen", 700, false);
        System.out.println(anime1);
        System.out.println(anime2);
    }
}