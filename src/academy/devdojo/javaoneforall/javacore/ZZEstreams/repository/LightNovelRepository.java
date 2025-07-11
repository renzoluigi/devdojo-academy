package academy.devdojo.javaoneforall.javacore.ZZEstreams.repository;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category.*;

public class LightNovelRepository {
    public static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Qualidea", 3.99, FANTASY),
            new LightNovel("Super Minion", 13.99, FANTASY),
            new LightNovel("Hatsukoi Losstime", 2.89, ROMANCE),
            new LightNovel("Hatsukoi Losstime", 2.89, ROMANCE),
            new LightNovel("Sword Art Online", 9.99, FANTASY),
            new LightNovel("Bastard", 1.99, FANTASY),
            new LightNovel("Bastard", 1.99, FANTASY),
            new LightNovel("Stranger Visitors", 3.29, DRAMA)
    ));
}
