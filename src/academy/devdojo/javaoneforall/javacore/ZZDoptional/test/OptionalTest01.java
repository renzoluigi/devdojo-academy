package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("william");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
        String empty = nameOptional.orElse("Empty"); // If is nullable, will be "Empty"

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase())); // If isn't will do that

            System.out.println(empty);
    }


    public static String findName(String name) {
        List<String> names = List.of("William", "DevDojo");
        int i = names.indexOf(name);
        if (i != -1) {
            return names.get(i);
        }
        return null;
    }
}
