package academy.devdojo.javaoneforall.javacore.Einitializationblock.test;

import academy.devdojo.javaoneforall.javacore.Einitializationblock.domain.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("");
        Anime anime2 = new Anime("");
        System.out.println(Arrays.toString(anime1.getEpisodes()));
    }
}
