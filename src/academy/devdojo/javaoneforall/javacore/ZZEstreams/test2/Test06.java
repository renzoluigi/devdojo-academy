package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test06 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        List<String> collect = lightNovelList.stream().map(LightNovel::getTitle).sorted().collect(Collectors.toList());
        List<String> collect1 = lightNovelList.stream().map(LightNovel::getTitle).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
