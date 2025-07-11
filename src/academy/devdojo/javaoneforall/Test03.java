package academy.devdojo.javaoneforall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test03 {
    private static List<String> names = new ArrayList<>(List.of("Renan", "Renzo", "João", "Andrey", "Luxxta"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name you are looking for: ");
        String desiredName = scanner.nextLine();

        Optional<String> found = findBy(name -> name.equalsIgnoreCase(desiredName));
        String ifEmpty = found.orElse("No one was found with that name.");

        System.out.println(ifEmpty);
    }

    public static Optional<String> findBy(Predicate<String> predicate) {
        String found = null;
        for (String name : names) {
            if (predicate.test(name)) {
                found = name;
            }
        }
        return Optional.ofNullable(found);
    }
}
