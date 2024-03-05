package io.codelex.typesandvariables.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SpeedCalculator {

    public static double metersPerSec(int meters, int hours, int minutes, int seconds) { /* method which calculates
    speed in meters per second with the provided CORRECT arguments.*/
        double totalTimeInSec = (hours * 3600) + (minutes * 60) + seconds; /* calculating total time in seconds
        for implementation as requirements by physics.*/
        return meters / totalTimeInSec; // returns resulting meters per second value.
    }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // new user input obj.

        int distanceInMeters = 0, hours = 0, minutes = 0, seconds = 0; /* declared and initialized necessary variables.
        Initialized for the while statement to work.*/

        DecimalFormat df = new DecimalFormat("0.00000000"); // later used for formatting resulting numbers to 8 decimals.

        System.out.println("I calculate speed and output it in meters per second, km per hour and miles per hour.\n"); // intro.

        do { // logic/program repeats if the user input values for each variable are below zero as the while loop defines.
            System.out.print("\tPlease input the distance in meters: ");
            distanceInMeters = in.nextInt(); // distance variable gets initialized for user input (integers!).

            if (distanceInMeters <= 0) { // if the input number is bellow or equal to zero error message is printed.
                System.out.println("A valid input is required. Program restarted.\n");
                continue; // if the statement is not true, the program continues on to the next "if" statement.
            }


            System.out.print("\n\tInput hours: "); // moves on to ask for amount hours.
            hours = in.nextInt(); // initializes for user input and assigns value.

            if (hours <= 0) { // again, if hours are bellow or equal to zero, the program prints error message.
                System.out.println("A valid input is required. Program restarted.\n");
                continue; // if false, continue. Same for the rest of the "if" statements.
            }


            System.out.print("\n\tInput minutes: ");
            minutes = in.nextInt();

            if (minutes < 0) {
                System.out.println("A valid input is required. Program restarted.\n");
                continue;
            }


            System.out.print("\n\tLastly - input seconds: ");
            seconds = in.nextInt();

            if (seconds < 0) {
                System.out.println("A valid input is required. Program restarted.\n");
                continue;
            }

             // if all the "if" statements evaluated to false and each continued, the program excutes fully
            double mPerSec = metersPerSec(distanceInMeters, hours, minutes, seconds); // calling method to calculate m/s
            double kmPerSec = mPerSec * 3.6; // calculating km/h
            double milesPerSec = mPerSec * 2.23694; // calculating miles/h

            System.out.println("\nYour speed in meters/second is " + df.format(mPerSec));
            System.out.println("Your speed in km/h is " + df.format(kmPerSec));
            System.out.println("Your speed in miles/h is " + df.format(milesPerSec));

        } while (distanceInMeters <= 0 || hours <= 0 || minutes < 0 || seconds < 0) ; /* while one of these are true,
        the program repeats.*/

        in.close(); // program closes after successfully executing.
    }
}
