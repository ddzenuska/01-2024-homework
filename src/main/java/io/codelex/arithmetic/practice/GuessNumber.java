package io.codelex.arithmetic.practice;

import java.util.*;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int input;
        Random rand = new Random();

        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it. " +
                "\nType \"exit\" to quit program."); // intro.

        do {
            int randNum = rand.nextInt(100) + 1; // generates a new number with every loop.
            System.out.print("> ");
            if (in.hasNextInt()) { // "if" input is an int
                input = in.nextInt();
                if (input == randNum) {
                    System.out.println("You guessed it! What are the odds?!?");
                    break;
                } else if (input < randNum) { // "else if" the guess is too low
                    System.out.println("Sorry, you are too low. I was thinking of " + randNum + ".");
                    break;
                } else if (input > randNum) { // "else if" the guess is too high
                    System.out.println("Sorry, you are too high.  I was thinking of " + randNum + ".");
                    break;
                }
            } else if (in.hasNext()) { // "else if" the input is a line of string
                String userInput = in.next();
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("\nProgram closed. Bye!");
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Try again.");
                in.next();
            }
        } while (!in.nextLine().equalsIgnoreCase("exit"));
        in.close();
    }
}
