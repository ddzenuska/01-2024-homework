package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }
        } while (choice != 4);
    }

    public static int getMenu() {
        int userChoice;

        Scanner keyboard = new Scanner(System.in);
        // Display the menu.
        System.out.println("\n\tGeometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();
        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
            keyboard.nextLine(); // consumes input that is left after user choise
        }
        return userChoice;
    }

    public static BigDecimal areaOfCircle(BigDecimal r) {
        if (r.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Invalid input!");
            return ZERO;
        }
        return BigDecimal.valueOf(Math.PI).multiply(r.multiply(r)); // to be able to multiply "double" with "BigDecimal".
    }

    public static BigDecimal areaOfRectangle(BigDecimal len, BigDecimal width) {
        if (len.compareTo(BigDecimal.ZERO) < 0 || width.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Invalid input!");
            return ZERO;
        }
        return len.multiply(width);
    }

    public static BigDecimal areaOfTriangle(BigDecimal lenBase, BigDecimal height) {
        if (lenBase.compareTo(BigDecimal.ZERO) < 0 || height.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Invalid input!");
            return ZERO;
        }
        return lenBase.multiply(height).multiply(BigDecimal.valueOf(0.5));
    }

    public static void calculateCircleArea() {
        BigDecimal radius = ZERO;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the circle's radius? ");
        radius = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfCircle(radius);
        // Display output
        if (result.compareTo(BigDecimal.ZERO) != 0) {
            System.out.println("The circle's area is " + result);
        } /* otherwise, nothing gets printed except for the error message. Without this statement, the error message is
         printed with the result message.*/
    }

    public static void calculateRectangleArea() {
        BigDecimal length = ZERO;
        BigDecimal width = ZERO;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length? ");
        length = keyboard.nextBigDecimal();

        System.out.print("Enter width? ");
        width = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfRectangle(length, width);
        if (result.compareTo(BigDecimal.ZERO) != 0) {
            System.out.println("The circle's area is " + result);
        }
    }

    public static void calculateTriangleArea() {
        BigDecimal base = ZERO;
        BigDecimal height = ZERO;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length of the triangle's base? ");
        base = keyboard.nextBigDecimal();

        System.out.print("Enter triangle's height? ");
        height = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfTriangle(base, height);
        if (result.compareTo(BigDecimal.ZERO) != 0) {
            System.out.println("The circle's area is " + result);
        }
    }
}
