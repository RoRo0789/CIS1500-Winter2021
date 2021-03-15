package chapter6;

public class BankAccount {

    private double balance;
    private String name;

    public BankAccount(String name) {
        this.name = name;
        balance = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void deposit(String amount) {
        deposit(Double.parseDouble(amount));
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public void withdraw(String amount) {
        withdraw(Double.parseDouble(amount));
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
