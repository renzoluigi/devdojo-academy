package academy.devdojo.javaoneforall.javacore.ZZClambdas.service;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2) {
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }

    public int compareByTitleNonStatic(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }
}
