package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Renzo", "Sofia", "Vitor Roque");

        List<Integer> length = map(names, name -> name.length());
        List<String> map = map(names, name -> name.toLowerCase()); // the types can be equal

        System.out.println(length);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> mapped = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            mapped.add(r);
        }
        return mapped;
    }
}
