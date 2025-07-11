package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

import academy.devdojo.javaoneforall.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("WASTED");
            }
        }
    }

    private synchronized void withdraw(int amount) { // with this, we can avoid concurrence/asynchronism (lock thread)
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " is going to withdraw money");
            // the problem is here, if the thread stops, the next verification will not consider the withdrawal of the previous thread
            // i.s., the thread that starts this method has to finish before another thread start it (avoid concurrence)
            account.withdraw(amount);
            System.out.println(getThreadName() + " completed the withdraw, balance of the account: " + account.getBalance());
        } else {
            System.out.println("Without enough money to " + getThreadName() + " do the withdraw");
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
