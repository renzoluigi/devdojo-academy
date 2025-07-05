package academy.devdojo.javaoneforall.javacore.ZZBbehavior.test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest04 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<String> names = List.of("Renzo", "Sofia", "Gabriel", "Renan", "Andrey");

        System.out.println(filter(numbers, number -> number % 2 == 0));
        System.out.println(filter(names, name -> name.length() > 5)); // it's working overriding the method test()
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) { // Most generic
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
