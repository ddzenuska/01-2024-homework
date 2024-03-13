package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        if (in.hasNextInt()) { // nested if statements to check if the user input value is valid.
            int input = in.nextInt(); // if it is, variable "input" is declared and initialized with the value.

            if (input > 0) {
                System.out.println("Number is positive");
            } else if (input < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        } else {
            System.err.println("Invalid input"); // this error message prints if input is invalid.
        }
    }

}
