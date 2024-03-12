package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class CalculatingSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This calculator can calculate the sum of two numbers only.");
        String dnOrInt; // declaring a String variable which will hold the users input answer ("dec" or "int")

        do {
            System.out.print("Will these be decimal numbers or integers? dec/int: ");
            dnOrInt = scanner.nextLine();

            if (dnOrInt.equalsIgnoreCase("dec")) { // if the answer is dec than the logic for summing decimal numbers is executed.

                System.out.println("Please provide the first number below:");
                double aDn = scanner.nextDouble(); // asks for the first double data type number input in the terminal
                System.out.println("Please provide the second number below:");
                double bDn = scanner.nextDouble(); // asks for the second double data type number input in the terminal
                System.out.println("Result of summing " + aDn + " and " + bDn + " is " + (aDn + bDn) + ".");

            } else if (dnOrInt.equalsIgnoreCase("int")) { // else if the answer is int, logic for summing integers is executed
                System.out.println("Please provide the first number below:");
                int aInt = scanner.nextInt();
                System.out.println("Please provide the second number below:");
                int bInt = scanner.nextInt();
                System.out.println("Result of summing " + aInt + " and " + bInt + " is " + (aInt + bInt) + ".");

            } else { // if the input is not dec or int.
                System.out.println("Invalid input. Please enter 'dec' for decimal numbers or 'int' for integers.");
            }

        } while (!dnOrInt.equalsIgnoreCase("dec") && !dnOrInt.equalsIgnoreCase("int")); /*while the input does not
    equal dec or int, the program repeats.*/

        scanner.close();
    }
}