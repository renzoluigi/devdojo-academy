package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1).limit(100).forEach(System.out::println);

        System.out.println("-------");

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}) // fibonacci sequence
                .limit(10)
                .forEach(arr -> System.out.println(Arrays.toString(arr) + " "));

        System.out.println("-------");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(arr -> arr[0])
                .forEach(System.out::println);

        System.out.println("-------");

        ThreadLocalRandom random = ThreadLocalRandom.current(); // random number
        Stream.generate(() -> random.nextInt(1, 500)) // generate 10 number 1-500
                .limit(10)
                .forEach(System.out::println);
    }
}
