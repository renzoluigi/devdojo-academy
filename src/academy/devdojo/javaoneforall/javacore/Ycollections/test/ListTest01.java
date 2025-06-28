package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(32); // Can define an initial capacity, but standard is 16
        List<String> names2 = new ArrayList<>();
        names.add("Renzo");
        names.add("Luigi");
        names2.add("Sofia");
        names2.add("Marques");
        names.addAll(names2);
        for (String name : names) {
            System.out.println(name);
            names.add("a");
        }
        names.remove("William");
    }
}
