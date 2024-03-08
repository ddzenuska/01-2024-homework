package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input a number: ");
        if (in.hasNextInt()) { // check if input is an integer.
            int userInput = in.nextInt();
            converter(userInput);
        } else {
            System.err.println("Invalid Input.");
        }
    }

    public static void converter(int count) {

        for (int i = 0; i <= count; i++) {
            if (i % 20 == 0 && i % 3 == 0 && i % 5 == 0) { // eliminates the case of 60 being printed as buzz
                System.out.println("FizzBuzz ");
            } else if (i % 20 == 0) {
                System.out.println("Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
