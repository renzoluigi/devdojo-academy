package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50) // inclusively
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        IntStream.range(1, 50) // exclusively
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n + " "));

        System.out.println();

        Stream.of("Brick", " by ", "brick") // Stream<String>
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(num) // IntStream
                .average()
                .ifPresent(System.out::println);

        // Files as a Stream

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(line -> line.startsWith("Java") || line.startsWith("java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
