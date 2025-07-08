package academy.devdojo.javaoneforall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test4 {
    private static List<String> names = new ArrayList<>(List.of("Renan", "Renzo", "João", "Andrey", "Luxxta"));

    public static void main(String[] args) {
        List<Character> collect = names.stream()
                .sorted()
                .map(name -> name.charAt(0))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
