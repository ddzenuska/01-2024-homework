package io.codelex.classesandobjects.practice;

public class MoneyTransfer {
    public static void main(String[] args) {
        // First transfer
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattsAccount);
        System.out.println(myAccount + "\n");

        System.out.println("Withdrew 100.0 from Matt's account and deposited to My account.");
        System.out.println(mattsAccount);
        System.out.println(myAccount + "\n\n\n");

        // Money tranfer
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        transfer(a, b, 50);
        transfer(b, c, 25);
        System.out.println("\nTransferred 50.0 from account A to account B.");
        System.out.println("Transferred 25.0 from account B to account C.\n");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        to.deposit(howMuch);
        from.withdrawal(howMuch);
    }
}
