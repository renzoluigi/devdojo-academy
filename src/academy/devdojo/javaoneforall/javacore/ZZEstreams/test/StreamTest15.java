package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        // Category and price infos (Collectors.summarizingDouble())
        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Category and Normal Price and Under Promotion prices count
        Map<Category, Map<Promotion, Long>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.counting())));
        System.out.println(collect1);

        // Category and Normal Price and Under Promotion (without the object)
        Map<Category, Set<Promotion>> collect2 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toSet())));
        System.out.println(collect2);

        // Category and Normal Price and Under Promotion (without the object), but with LinkedHashSet
        Map<Category, Set<Promotion>> collect3 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }
}
