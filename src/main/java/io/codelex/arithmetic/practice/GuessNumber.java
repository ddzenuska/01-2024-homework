package io.codelex.arithmetic.practice;

import java.util.*;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {

        int input; // user input
        Random rand = new Random(); // new random num generator obj.

        Scanner in = new Scanner(System.in);

            System.out.println("I'm thinking of a number between 1-100. Try to guess it. " +
                    "\nType \"exit\" to quit program."); // intro.

        do {
            int randNum = rand.nextInt(100) + 1; // generates a new number with every loop.
            System.out.print("> ");
            if (in.hasNextInt()) { // "if" input is an int
                input = in.nextInt(); // "input" is assigned the input integer number.
                if (input == randNum) {
                    System.out.println("You guessed it! What are the odds?!?"); // guessed correctly this statement prints
                    break; // and the loop breaks.
                } else if (input < randNum) { // "else if" the guess is too low
                    System.out.println("Sorry, you are too low. I was thinking of " + randNum + ".");
                    break; // the loop breaks after statement is printed.
                } else if (input > randNum) { // "else if" the guess is too high
                    System.out.println("Sorry, you are too high.  I was thinking of " + randNum + ".");
                    break; // the loop breaks after statement is printed.
                }
            } else if (in.hasNext()) { // "else if" the input is a line of string
                String userInput = in.next(); // that gets assigned to a new string variable "userInput".
                if (userInput.equalsIgnoreCase("exit")) { // if the input is the word "exit"
                    System.out.println("\nProgram closed. Bye!"); // the program says "bye" and quits.
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                } // if the inputs are incorrect, one of these else statements execute and the program re-asks input.
            } else {
                System.out.println("Invalid input. Try again.");
                in.next(); // consumes an infinite loop if there is one.
            }
        } while (!in.nextLine().equalsIgnoreCase("exit")); /* "do while" loop continues while the
        input isn't equal to the word "exit".*/
        in.close();
    }
}
