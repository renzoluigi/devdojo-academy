package academy.devdojo.javaoneforall.javacore.ZZGconcurrency.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue ->
        TransferQueue<Object> tq = new LinkedTransferQueue<>();

        System.out.println(tq.add("Renzo")); // boolean or exception if exceeds capacity
        System.out.println(tq.offer("Luigi", 10, TimeUnit.SECONDS));
        tq.put("DevDojo"); // if it doesn't have capacity, will wait

        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo"); // if another thread consumes it
        }
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.tryTransfer("DevDojo", 5, TimeUnit.SECONDS));
        System.out.println(tq.element()); // works like peek but returns an exception if the queue is empty
        System.out.println(tq.poll());
        System.out.println(tq.remove()); // works like poll but returns an exception if the queue is empty

        System.out.println(tq.take());

        System.out.println(tq.remainingCapacity());
    }
}
