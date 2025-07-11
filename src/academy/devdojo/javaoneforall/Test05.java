package academy.devdojo.javaoneforall;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]}).limit(10).forEach(arr -> System.out.println(Arrays.toString(arr)));

        List<Computer> computers = List.of(new Computer("Asus", 1200.99), new Computer("Radeon", 399.99), new Computer("GeForce", 1999.99));

        DoubleSummaryStatistics collect = computers.stream().collect(Collectors.summarizingDouble(Computer::getPrice));
        System.out.println(collect);

        String collect1 = computers.stream().map(Computer::getName).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
