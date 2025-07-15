package academy.devdojo.javaoneforall.javacore.ZZGconcurrency.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.tryLock(2, TimeUnit.SECONDS);
            if (lock.isHeldByCurrentThread()) {
                System.out.printf("Thread %s takes the lock%n", name);
            }
            System.out.printf("Thread %s has entered in a critic session%n", name); // has entered the lock
            System.out.printf("%d Threads waiting on queue%n", lock.getQueueLength());
            System.out.printf("Thread %s will wait 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s has finished the wait%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new Worker("A", reentrantLock)).start();
        new Thread(new Worker("B", reentrantLock)).start();
        new Thread(new Worker("C", reentrantLock)).start();
        new Thread(new Worker("D", reentrantLock)).start();
        new Thread(new Worker("E", reentrantLock)).start();
        new Thread(new Worker("F", reentrantLock)).start();
        new Thread(new Worker("G", reentrantLock)).start();
    }
}
