package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.repository.LightNovelRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    public static void main(String[] args) {
        List<LightNovel> lightNovelList = LightNovelRepository.lightNovelList;

        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        ArrayList<LightNovel> drama = new ArrayList<>();
        ArrayList<LightNovel> fantasy = new ArrayList<>();
        ArrayList<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case FANTASY:
                    fantasy.add(lightNovel);
                    break;
                case ROMANCE:
                    romance.add(lightNovel);
                    break;
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);

        System.out.println(categoryLightNovelMap);

        // That is what Collectors.groupingBy do
        System.out.println(lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory)));
    }
}
