package io.codelex.classesandobjects.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,##0.00");
        double earnedInterest;
        double withdrawn = 0;
        double deposited = 0;

        System.out.print("How much money is in the account?: ");
        double balance = in.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualIntRate = in.nextDouble();
        System.out.print("How long has the account been opened?: ");
        int months = in.nextInt();

        SavingsAccount testAccount = new SavingsAccount(balance, annualIntRate);

        for (int month = 1; month <= months; month++) {
            System.out.print("Enter amount deposited for month " + month + ": ");
            double depositAmount = in.nextDouble();
            testAccount.deposit(depositAmount);
            deposited += depositAmount;

            System.out.print("Enter withdrawn for " + month + ": ");
            double withdrawAmount = in.nextDouble();
            testAccount.withdraw(withdrawAmount);
            withdrawn += withdrawAmount;

            testAccount.monthlyInterest();
        }

        earnedInterest = testAccount.getBalance() - balance - deposited + withdrawn;

        System.out.println("Total deposited: $" + df.format(deposited));
        System.out.println("Total withdrawn: $" + df.format(withdrawn));
        System.out.println("Interest earned: $" + df.format(earnedInterest));
        System.out.println("Ending balance: $" + df.format(testAccount.getBalance()));
    }
}
