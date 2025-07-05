package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Before Java 1.4
        List list = new ArrayList();
        list.add(1);
        list.add("a");
        list.add(new Consumer("Renzo"));

        for (Object object : list) {
            if (object instanceof String) {
                System.out.println(object + ": String");
            }
            if (object instanceof Integer) {
                System.out.println(object + ": Integer");
            }
            if (object instanceof Consumer) {
                Consumer consumer = (Consumer) object;
                System.out.println(consumer.getName() + ": Consumer");
            }
        }

        Consumer consumer = new Consumer("Sofia");
        add(list, consumer);
        System.out.print(list);
    }

    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
