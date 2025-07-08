package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Édipo", "Gustavo", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        //devdojo.forEach(list -> list.forEach(System.out::println));

        devdojo.stream()
                .flatMap(Collection::stream) // to take the value inside and create a stream
                .forEach(System.out::println);
    }
}
