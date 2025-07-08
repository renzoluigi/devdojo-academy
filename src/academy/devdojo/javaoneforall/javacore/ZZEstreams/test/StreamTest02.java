package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamTest02 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList()); // toList

        System.out.println(titles);
    }
}
