package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double balance;
    private double annualIntRate;

    public SavingsAccount(double balance, double annualIntRate) {
        this.balance = balance;
        this.annualIntRate = annualIntRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void monthlyInterest() {
        this.balance += this.balance * (annualIntRate / 12);
    }

    public double getBalance() {
        return balance;
    }
}