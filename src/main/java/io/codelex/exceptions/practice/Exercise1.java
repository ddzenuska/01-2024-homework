package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            int numerator = scanner.nextInt();
            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
        }
    }
}
