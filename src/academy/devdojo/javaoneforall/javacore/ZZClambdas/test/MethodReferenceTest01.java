package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));

//        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // 2 methods (.getTitle().compareTo()), can't use method reference

        animeList.sort(AnimeComparators::compareByTitle); // Same functional descriptor (a1.getTitle().compareTo(a2.getTitle())))
        System.out.println(animeList);

//        animeList.sort((a1, a2) -> a1.getEpisodes().compareTo(a2.getEpisodes()));
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
