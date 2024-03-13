package io.codelex.classesandobjects.practice;

// First account program
public class FirstAccount {
    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account", 100.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);

        bartosAccount.deposit(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
    }
}
