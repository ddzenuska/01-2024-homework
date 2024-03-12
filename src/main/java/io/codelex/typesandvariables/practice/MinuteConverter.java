package io.codelex.typesandvariables.practice;
// Convert minutes into a number of years and days.

import java.util.Scanner;
import java.text.DecimalFormat;

public class MinuteConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double inputTime;

        System.out.print("Hello, dear user! I convert minutes in to years and days.\n"); // introduction to the program.

        do { // will execute logic on repeat while be input is below zero (isn't valid).
            System.out.print("Please provide a number: ");
            if (in.hasNextDouble()) { // if the input is a double, the inputTime variable is assigned that value.
                inputTime = in.nextDouble();
                if (inputTime > 0) { // if inputTime value is bigger than zero, then the converter method is called and the program executed fully.
                    converter(inputTime);
                } else { // if the input number is below zero, this executes.
                    System.out.println("I only accept positive numbers.");
                    in.nextLine();
                }
            } else { // if the input value isn't a number, this executes.
                System.out.println("I only accept positive numbers.");
                in.nextLine();
                inputTime = -1; // sets inputTime to -1 so the "while" works making the program repeat.
            }

        } while (inputTime < 0);

        in.close(); // closing program after successful execution.
    }

    public static void converter(double minutes) { // void method which calculates provided minutes in to years and days.
        // used data type "double" to enable taking in large numbers. With "long", that didn't work.
        double years = minutes / 525600L; // calculating years.
        double remainingMin = years % 525600L; // calculating reaming minutes after calculating the number of years.
        double days = remainingMin / 1440L; // calculating minutes left from the remaining time after year calculation.

        DecimalFormat dfYAndM = new DecimalFormat("0.0000"); /* I thought calculated year and minutes values should be formatted to have 4 decimal numbers, to
        be nor too short, nor too long.*/

        System.out.println(minutes + " minutes converted to years and days comes to " + dfYAndM.format(years) + "years and " + dfYAndM.format(days) + "days.");
    }


}
