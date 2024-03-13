package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int dayNumber = 0;

        System.out.print("Please provide a number: ");
        if (in.hasNextInt()) {
            dayNumber = in.nextInt();
            if (dayNumber >= 1 && dayNumber <= 7) {
                whichDay(dayNumber);
            } else {
                System.out.println("Not a valid day.");
            }
        } else {
            System.out.println("Please enter a number.");
        }
    }

    public static void whichDay(int count) {
        switch (count) {
            case 0 -> System.out.println("Monday");
            case 1 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5 -> System.out.println("Saturday");
            case 6 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid day");
        }
    }

}
