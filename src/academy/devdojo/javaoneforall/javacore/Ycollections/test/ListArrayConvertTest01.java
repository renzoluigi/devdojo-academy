package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest01 {
    public static void main(String[] args) {
        // To Array
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArray = numbers.toArray(new Integer[0]); // With passing size 0 to array, the Java will extend it auto, and it's more performative
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------");

        // To List
        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        // Linked
        List<Integer> arrayToList = Arrays.asList(numbersArray); // It's linked to numbersArray (not good!)
        arrayToList.set(0, 12);
        // arrayToList.add(4); // UnsupportedOperationException

        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arrayToList);

        System.out.println("----------");

        // Unlinked
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(1);
        System.out.println(numbersList);

        // To use once line
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<String> list1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);// after version 11

    }
}
