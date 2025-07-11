package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test05 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        Map<Character, Long> collect = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.groupingBy(title -> title.charAt(0), Collectors.counting()));
        System.out.println(collect);
    }
}
