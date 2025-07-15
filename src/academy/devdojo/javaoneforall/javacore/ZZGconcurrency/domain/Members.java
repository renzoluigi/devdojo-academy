package academy.devdojo.javaoneforall.javacore.ZZGconcurrency.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition(); // to use wait, notify and notifyAll

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }

    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " added an email to list");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " without emails in the list, entering in wait mode");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notifying that we are not accepting emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}