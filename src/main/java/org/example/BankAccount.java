package org.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
