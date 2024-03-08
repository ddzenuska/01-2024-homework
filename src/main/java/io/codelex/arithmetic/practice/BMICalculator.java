package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {
    static double ibmStatus;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // new user input obj.

        do {
            System.out.print("Please provide your weight: ");
            if (in.hasNextDouble()) {
                double userWeight = in.nextDouble();
                System.out.print("Please provide your height: ");
                if (in.hasNextDouble()) {
                    double userHeight = in.nextDouble();
                    IBMStatus(userWeight, userHeight);
                } else { // if user input an invalid value, error message is printed.
                    System.out.println("\nInvalid input. Try again.");
                    in.next(); // consumes infinite loop and invalid input line
                }
            } else if (in.hasNext()) {
                String userExit = in.next();
                if (userExit.equalsIgnoreCase("exit")) {
                    System.out.println("\nStay healthy! Bye!");
                    break;
                } else {
                    System.out.println("\nInvalid input. Try again.");
                } // if the inputs are incorrect, one of these else statements execute.
            } else {
                System.out.println("\nInvalid input. Try again.");
                in.next();
            }
        } while (!in.nextLine().equalsIgnoreCase("exit"));
        in.close();
    }

    public static void IBMStatus(double weight, double height) { // method calculates and print ibm score.
        ibmStatus = (weight * 703) / (height * height);
        DecimalFormat df = new DecimalFormat("0.00");
        if (ibmStatus >= 18.5 && ibmStatus <= 25) {
            System.out.println("\nYour IBM score is " + df.format(ibmStatus) + ". You have optimal weight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        } else if (ibmStatus < 18.5) {
            System.out.println("\nYour IBM score is " + df.format(ibmStatus) + ". You are underweight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        } else {
            System.out.println("\nYour IBM score is " + df.format(ibmStatus) + ". You are overweight.\n" +
                    "If you would like to exit, type \"exit\".\n");
        }
    }
}
