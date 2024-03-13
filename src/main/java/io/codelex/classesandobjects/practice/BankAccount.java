package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.50);

        System.out.println(benben);

        benben.deposit(128);
        benben.withdraw(200);
        System.out.println(benben);
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return name + ", -$" + String.format("%.2f", Math.abs(balance));
        }
        return name + ", $" + String.format("%.2f", balance);
    }
}
