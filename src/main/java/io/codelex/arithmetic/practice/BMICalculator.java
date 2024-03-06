package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.text.DecimalFormat;
public class BMICalculator {

    static double iBM;

    public static void IBMStatus(double weight, double height) { // method calculates and print ibm score.
        iBM = (weight * 703) / (height * height);
        DecimalFormat df = new DecimalFormat("0.00");
        if (iBM >= 18.5 && iBM <=25) {
            System.out.println("\nYour IBM score is " + df.format(iBM) + ". You have optimal weight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        } else if (iBM < 18.5) {
            System.out.println("\nYour IBM score is " + df.format(iBM) + ". You are underweight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        } else {
            System.out.println("\nYour IBM score is " + df.format(iBM) + ". You are overweight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // new user input obj.

        do {
            System.out.print("Please provide your weight: ");

            if (in.hasNextDouble()) { // if provided a number
                double userWeight = in.nextDouble(); // user weight is declared and assigns user input double.
                System.out.print("Please provide your height: ");
                if (in.hasNextDouble()) {
                    double userHeight = in.nextDouble();

                    IBMStatus(userWeight, userHeight); // calling method with user input values
                } else { // if user input an invalid value, error message is printed.
                    System.out.println("\nInvalid input. Try again.");
                    in.next(); // consumes infinite loop and invalid input line
                }
            } else if (in.hasNext()) { // if input is a string a new String variable is declared and assigned.
                String userExit = in.next();
                if (userExit.equalsIgnoreCase("exit")) { // if the input is "exit"
                    System.out.println("\nStay healthy! Bye!"); // program says "bye" and the loop stops.
                    break;
                } else {
                    System.out.println("\nInvalid input. Try again.");
                } // if the inputs are incorrect, one of these else statements execute and the program re-asks input.
            } else {
                System.out.println("\nInvalid input. Try again.");
                in.next(); // consumes an infinite loop if there is one.
            }
        } while (!in.nextLine().equalsIgnoreCase("exit")); // while input isn't "exit", program repeats.

        in.close();
    }
}
