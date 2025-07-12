package academy.devdojo.javaoneforall.javacore.ZZFthreads.domain;

public class Account {
    private int balance = 50;

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}