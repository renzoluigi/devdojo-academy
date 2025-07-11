package academy.devdojo.javaoneforall.javacore.ZZEstreams.test2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, Integer> collect = integers.stream().collect(Collectors.groupingBy(num -> num % 2 == 0 ? "EVEN" : "ODD", Collectors.summingInt(Integer::intValue)));
        System.out.println(collect);
    }
}
