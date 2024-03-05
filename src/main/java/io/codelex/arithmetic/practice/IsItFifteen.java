package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class IsItFifteen {

    public static boolean isItFifteen(int a, int b) { // method which checks for 15 and returns true.

        return (a == 15 || b == 15 || a + b == 15 || a - b == 15 || b - a == 15);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // new scanner object.

        int a, b; // variables which will hold user input values.

        System.out.println("I print true if either one of two provided integers is 15 or their sum or difference is 15.");// intro.


        /* The loop is not perfect if it has to repeat, but works. I couldn't figure the cause of out the issue.*/

        do { // "do while" loop. Will repeat if the user supplies a double data type number instead of an int.
            System.out.print("\n\tPlease provide the first number: ");

            if (in.hasNextInt()) { // if the num is an int.
                a = in.nextInt(); // variable "a" gets assigned the first user input value.
                System.out.print("\n\tPlease provide the second number: ");

                if (in.hasNextInt()) { // for the next num, if the num is an int.
                    b = in.nextInt(); // variable "b" gets assigned the second user input value.
                    if (isItFifteen(a, b)) { // if method call evaluates to true.
                        System.out.println("\nAnswer: true"); // prints that the answer is true.
                        break; // and the program stops.
                    } else { // if method call evaluates to false.
                        System.out.println("\nAnswer: false"); // prints false and breaks.
                        break;
                    }
                } else { // error message for if input value for variable "b" was a "double".
                    System.out.println("\nInvalid input. Program will repeat.");
                    in.nextLine(); // to not show an infinite loop after "double" value has been supplied.
                }
            } else {// error message for if input value for variable "a" was a "double".
                System.out.println("\nInvalid input. Program will repeat.");
                in.nextLine(); // to not show an infinite loop.
            }
        } while (true); // while it is true that the if statements evaluate to false, the loop repeats.

        in.close();
    }
}
