package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javaoneforall.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> pokemon = MangaRepository.findByTitle("Pokemon");
        pokemon.ifPresent(manga -> manga.setTitle(manga.getTitle() + " 2"));
        System.out.println(pokemon);

        Manga manga = MangaRepository.findByTitle("Boku no Hero")
                .orElse(new Manga(400, "Boku no Hero", 50));
        System.out.println(manga);

        Manga mangaById = MangaRepository.findById(400)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);
    }
}
