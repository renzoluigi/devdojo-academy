package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get(); // to get an instance
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new; //(title, episodes) -> new Anime(title, episodes)
        System.out.println(animeBiFunction.apply("Demon Slayer", 3));
    }
}
