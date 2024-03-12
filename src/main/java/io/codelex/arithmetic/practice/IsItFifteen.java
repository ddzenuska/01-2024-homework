package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class IsItFifteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.println("I print true if either one of two provided integers is 15 or their sum or difference is 15.");
        do {
            System.out.print("\n\tPlease provide the first number: ");

            if (in.hasNextInt()) { // if the num is an int.
                a = in.nextInt();
                System.out.print("\n\tPlease provide the second number: ");
                if (in.hasNextInt()) {
                    b = in.nextInt();
                    if (isItFifteen(a, b)) { // if method call evaluates to true.
                        System.out.println("\nAnswer: true");
                        break;
                    } else { // if method call evaluates to false.
                        System.out.println("\nAnswer: false");
                        break;
                    }
                } else {
                    System.out.println("\nInvalid input. Program will repeat.");
                    in.nextLine();
                }
            } else {
                System.out.println("\nInvalid input. Program will repeat.");
                in.nextLine();
            }
        } while (true); // while it is true that the if statements evaluate to false, the loop repeats.
        in.close();
    }

    public static boolean isItFifteen(int a, int b) { // method which checks for 15 and returns true.

        return (a == 15 || b == 15 || a + b == 15 || a - b == 15 || b - a == 15);
    }
}
