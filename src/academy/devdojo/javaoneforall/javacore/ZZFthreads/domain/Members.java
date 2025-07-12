package academy.devdojo.javaoneforall.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " added an email to list");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails) {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " without emails in the list, entering in wait mode");
                try {
                    this.emails.wait(); // needs to be in a lock block (sync block)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notifying that we are not accepting emails");
        }
    }
}
