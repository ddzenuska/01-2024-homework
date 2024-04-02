package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter the numerator");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int numerator = Integer.parseInt(input);
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                scanner.nextLine();
                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0");
                } else {
                    System.out.println(numerator + " / " + divisor + " is " + (numerator / divisor));
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.\nPlease try again.");
                scanner.nextLine();
            }
        }
    }
}
