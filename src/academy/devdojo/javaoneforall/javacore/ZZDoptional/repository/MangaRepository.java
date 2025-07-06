package academy.devdojo.javaoneforall.javacore.ZZDoptional.repository;

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    public static List<Manga> mangas = List.of(new Manga(3, "Pokemon", 3), new Manga(4, "Dragon Ball Z", 4), new Manga(1, "Hellsing Ultimate", 5), new Manga(6, "Berserk", 6), new Manga(14, "Attack on Titan", 7));

    public static Optional<Manga> findByTitle(String title) {
        return find(manga -> manga.getTitle().equalsIgnoreCase(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return find(manga -> manga.getId().equals(id));
    }

    private static Optional<Manga> find(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
