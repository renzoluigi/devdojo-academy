package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;

public class Test08 {
    public static void main(String[] args) {
        LightNovelRepository.lightNovelList.stream().map(LightNovel::getPrice).sorted().skip(1).findFirst().ifPresent(System.out::println);
        LightNovelRepository.lightNovelList.stream().map(LightNovel::getPrice).sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
