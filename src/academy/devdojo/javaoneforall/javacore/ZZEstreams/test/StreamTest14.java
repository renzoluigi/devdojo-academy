package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest14 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        // Category + Sum (Collectors.summingDouble())
        Map<Category, Double> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Category + Count (Collectors.counting())
        Map<Category, Long> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect1);

        // Category + Optional of max price (Collectors.maxBy)
        Map<Category, Optional<LightNovel>> collect2 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);

        // Category + Light Novel max price (Collectors.collectingAndThen(Collectors.maxBy, action))
        Map<Category, LightNovel> collect3 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.print(collect3);
    }
}
