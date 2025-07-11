package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;

public class Test07 {
    public static void main(String[] args) {
        LightNovelRepository.lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        LightNovelRepository.lightNovelList.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
    }
}
