package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamTest01 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> lessThanFour = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            if (lessThanFour.size() > 2) {
                break;
            }
            if (lightNovel.getPrice() < 4) {
                lessThanFour.add(lightNovel.getTitle());
            }
        }

        lessThanFour.forEach(System.out::println);
    }
}
