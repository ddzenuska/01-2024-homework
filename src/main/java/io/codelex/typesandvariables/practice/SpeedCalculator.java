package io.codelex.typesandvariables.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distanceInMeters = 0, hours = 0, minutes = 0, seconds = 0;
        DecimalFormat df = new DecimalFormat("0.00000000");

        System.out.println("I calculate speed and output it in meters per second, km per hour and miles per hour.\n"); // intro.

        do {
            System.out.print("\tPlease input the distance in meters: ");
            distanceInMeters = in.nextInt();
            if (distanceInMeters <= 0) {
                System.out.println("A valid input is required. Program restarted.\n");
                continue;
            }

            System.out.print("\n\tInput hours: ");
            hours = in.nextInt();
            if (hours <= 0) {
                System.out.println("A valid input is required. Program restarted.\n");
                continue;
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
            double mPerSec = metersPerSec(distanceInMeters, hours, minutes, seconds);
            double kmPerSec = mPerSec * 3.6;
            double milesPerSec = mPerSec * 2.23694;

            System.out.println("\nYour speed in meters/second is " + df.format(mPerSec));
            System.out.println("Your speed in km/h is " + df.format(kmPerSec));
            System.out.println("Your speed in miles/h is " + df.format(milesPerSec));

        } while (distanceInMeters <= 0 || hours <= 0 || minutes < 0 || seconds < 0);
        in.close();
    }

    public static double metersPerSec(int meters, int hours, int minutes, int seconds) {
        double totalTimeInSec = (hours * 3600) + (minutes * 60) + seconds;
        return meters / totalTimeInSec;
    }
}
