package academy.devdojo.javaoneforall.javacore.ZZFthreads.service;

import academy.devdojo.javaoneforall.javacore.ZZFthreads.domain.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(Thread.currentThread().getName() + " sending email to " + email);
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " sent an email with success to " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All emails sent with success!");
    }
}
