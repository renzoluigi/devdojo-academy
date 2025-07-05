package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("William", "Renato", "Aldair");
        List<Integer> numbers = List.of(1, 2, 3, 4);

        forEach(names, s -> System.out.println(s));
        forEach(numbers, number -> System.out.println(number));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
