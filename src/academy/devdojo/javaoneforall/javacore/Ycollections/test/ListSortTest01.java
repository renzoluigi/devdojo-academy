package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Pokemon");
        mangas.add("Dragon Ball");
        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Attack on Titan");

        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> values = new ArrayList<>();
        values.add(132D);
        values.add(32.5);
        values.add(110.33);

        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
    }
}
