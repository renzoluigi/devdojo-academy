package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting())); // using Collectors

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println("-----");

        // Summarizing
        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)); // count, sum, min, average, max
        System.out.println(collect);

        String collect1 = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ")); // Join the elements, disregarding the last one
        System.out.println(collect1);
    }
}
