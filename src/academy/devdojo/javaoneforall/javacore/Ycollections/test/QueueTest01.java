package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        // FIFO -> First In, First Out
        Queue<String> queue = new PriorityQueue<>(); // Ordered by compareTo or a comparator
        queue.add("C");
        queue.add("A"); // returns an exception if he can't add value to queue (out of bound)
        queue.offer("B"); // returns a boolean

        System.out.println(queue.peek()); // Take the first element

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Take the first element and remove
            // or queue.remove()
        }

    }
}
