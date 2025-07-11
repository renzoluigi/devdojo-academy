package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        Double collect = lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice));
        System.out.println(collect);
    }
}
