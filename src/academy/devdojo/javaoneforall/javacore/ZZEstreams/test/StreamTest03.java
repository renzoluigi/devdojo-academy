package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        long count = lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .count();

        long count2 = lightNovelList.stream() // distinct objects
                .distinct() // needs equals and hashcode
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .count();

        System.out.println(count);
        System.out.println(count2);
    }
}