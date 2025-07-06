package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        //non static
        names.sort(String::compareTo); // by logic, will consider the alphabetic order

        // i -> Integer.parseInt(i);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10201"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Alberto"));
    }
}
