package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("------");

        // Operations with an initial value

        System.out.println(lightNovelList.stream().map(LightNovel::getPrice).reduce(1D, Double::sum));

        System.out.println("------");

        System.out.println(lightNovelList.stream().map(LightNovel::getPrice).reduce(0D, (ln1, ln2) -> ln1 - ln2));

        System.out.println("------");

        System.out.println(lightNovelList.stream().map(LightNovel::getPrice).reduce(1D, (ln1, ln2) -> ln1 * ln2));

        System.out.println("------");

        System.out.println(lightNovelList.stream().map(LightNovel::getPrice).reduce(1D, (ln1, ln2) -> ln1 / ln2));

        System.out.println("------");

        // to get max value
        lightNovelList.stream().map(LightNovel::getPrice).reduce(Double::max).ifPresent(System.out::println);
        //or
        lightNovelList.stream().map(LightNovel::getPrice).max(Double::compare).ifPresent(System.out::println);
    }
}
