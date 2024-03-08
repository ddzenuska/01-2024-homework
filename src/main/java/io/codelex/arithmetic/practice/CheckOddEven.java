package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in); // new scanner obj.
        int num = 0;

        System.out.println("I will print whether the provided number is an odd or even number. \n" +
                "If you would like to quit this program, type \"exit\".");
        do {
            System.out.print("\n\tInput number: ");
            if (start.hasNextInt()) {
                num = start.nextInt();
                isItOdd(num);
            } else if (start.hasNext()) { // "else if" the input is a non-empty string, means that there must be a string.
                String userInput = start.next();
                if (userInput.equalsIgnoreCase("exit")) { // if the input string is equal to the word "exit".
                    System.out.println("bye!");
                    break;
                } else {
                    System.out.println("\nInvalid input. Program will repeat.");
                }
            } else {
                System.out.println("\nInvalid input. Program will repeat.");
                start.next();
            }
        } while (!start.nextLine().equalsIgnoreCase("exit")); // continues while the input is not "exit".
        start.close();
    }

    public static void isItOdd(int a) { // method which checks for 15 and returns true.
        if (a % 2 == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }
    }
}

