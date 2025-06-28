package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        Collections.sort(numbers); // Before use binary search, the collection needs to be sorted
        System.out.println(Collections.binarySearch(numbers, 2));
        System.out.println(Collections.binarySearch(numbers, 1)); // (-(insertion point) -1)
    }
}
