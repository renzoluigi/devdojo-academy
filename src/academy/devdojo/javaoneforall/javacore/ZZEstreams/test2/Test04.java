package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test04 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        Set<LightNovel> collect = lightNovelList.stream().collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
