package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;

public class StreamTest08 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        Double sum = lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice) // to don't need to boxing and unboxing
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
