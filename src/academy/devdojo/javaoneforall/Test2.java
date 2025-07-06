package academy.devdojo.javaoneforall;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Renan", "Renzo", "João", "Andrey", "Luxxta"));

        names.forEach(System.out::println);

        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Character> firstOneLetter = name -> name.charAt(0);
        System.out.println(firstOneLetter.apply("Renzo"));

        Consumer<String> show = s -> System.out.println("name: " + s);
        show.accept("Renzo");

        Predicate<String> nameLength = s -> s.length() > 5;
        for (String name : names) {
            System.out.println(nameLength.test(name));
        }
    }
}
