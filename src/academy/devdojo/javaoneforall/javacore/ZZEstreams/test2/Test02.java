package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;
        List<String> collect = lightNovelList.stream().map(ln -> ln.getTitle().toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
