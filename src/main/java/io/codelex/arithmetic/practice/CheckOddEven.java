package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void isItOdd(int a) { // method which checks for 15 and returns true.

        if (a % 2 == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }
    }
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in); // new scanner obj.


        int num = 0; /* variables which will hold user input number. It is already initialized
        for the close statement to work.*/

        System.out.println("I will print whether the provided number is an odd or even number. \n" +
                "If you would like to quit this program, type \"exit\".");// intro.

        do { // this loop will repeat until the user types "exit" in the terminal.
            System.out.print("\n\tInput number: ");
            if (start.hasNextInt()) { // if the num is an int.
                num = start.nextInt(); // variable gets assigned user input value.
                isItOdd(num); // and is put in the method which will print on its own as it doesn't return anything.
            }
            else if (start.hasNext()) { // "else if" the input is a non-empty string, means that there must be a string.
                String userInput = start.next(); // this line reads the string and assigns it to a variable "userInput".
                if (userInput.equalsIgnoreCase("exit")) { // if the input string is equal to the word "exit".
                    System.out.println("bye!"); // program prints "bye" and stops.
                    break;
                }
                else { // if a non-int number is supplied, error message prints and the program repeats
                    System.out.println("\nInvalid input. Program will repeat.");
                }
            } else {
                System.out.println("\nInvalid input. Program will repeat.");
                start.next(); /* reads and discards the invalid output for the loop to become infinite,
                after which the loop re-begins.*/
            }

        } while (!start.nextLine().equalsIgnoreCase("exit")); // continues while the input is not "exit".

        start.close();
    }
}

