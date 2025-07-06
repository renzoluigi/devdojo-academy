package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();

        animeList.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animeList);

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
