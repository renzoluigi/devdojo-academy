package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

import academy.devdojo.javaoneforall.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

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

    private void withdraw(int amount) { // with synchronized, we can avoid parallelism/asynchronism (lock) and execute atomically
        System.out.println(getThreadName() + " #### outside the synchronized");
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " **** inside the synchronized");
                // the problem is here, if the thread stops, the next verification will not consider the withdrawal of the previous thread
                // i.s., the thread that starts this method has to finish before another thread start it (avoid parallelism)
                account.withdraw(amount);
                System.out.println(getThreadName() + " completed the withdraw, balance of the account: " + account.getBalance());
            } else {
                System.out.println("Without enough money to " + getThreadName() + " do the withdraw");
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
