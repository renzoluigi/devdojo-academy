package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000); // sleep and swap thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        // All programs have a Thread
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
//        t1.start(); // Starts a new thread
//        t2.start();
//        t3.start();
//        t4.start();
        // random alternation (Runnable <--> Running)

        // As Runnable
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A"); // Accepts a Runnable
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY); // or 10, but with enum we can normalize
        t2.start();
        t1.start();
        t3.start();
        t4.start();
//        tr1.start(); // Can't start twice (throws exception)
        System.out.println("#####################" + Thread.currentThread().getName());
    }
}
