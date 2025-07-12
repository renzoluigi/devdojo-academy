package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>()); // Returns a thread safe list (synchronized)

    public void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() { // To be completely thread safe (because only the methods of the list are synchronized)
        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}


public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
