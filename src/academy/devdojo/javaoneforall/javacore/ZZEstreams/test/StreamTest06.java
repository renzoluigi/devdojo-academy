package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        System.out.println(lightNovelList.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 3)); // any light novel with price > 3?
        System.out.println(lightNovelList.stream().allMatch(lightNovel -> lightNovel.getPrice() > 2)); // all light novels have price > 2?
        System.out.println(lightNovelList.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 15)); // all light novels don't have a price > 15?

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println); // because returns an Optional<LightNovel>

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
