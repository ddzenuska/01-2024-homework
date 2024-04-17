package io.codelex.classesandobjects.practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.50);

        System.out.println(benben);

        benben.deposit(128);
        benben.withdraw(200);
        System.out.println(benben);
    }
}
