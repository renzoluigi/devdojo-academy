package academy.devdojo.javaoneforall.javacore.ZZEstreams.repository;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class LightNovelRepository {
    public static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Qualidea", 3.99),
            new LightNovel("Super Minion", 13.99),
            new LightNovel("Hatsukoi Losstime", 2.89),
            new LightNovel("Hatsukoi Losstime", 2.89),
            new LightNovel("Sword Art Online", 9.99),
            new LightNovel("Bastard", 1.99),
            new LightNovel("Bastard", 1.99),
            new LightNovel("Stranger Visitors", 3.29))
    );
}
