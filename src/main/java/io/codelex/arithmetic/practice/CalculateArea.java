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

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("\n\tGeometry Calculator\n"); // modified so the output looks better
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

    public static BigDecimal areaOfCircle(BigDecimal r) { // method for calculating are of a circle.
        if (r.compareTo(BigDecimal.ZERO) < 0) { // if the input is below zero, an error message prints and the value of zero is returned.
            System.out.println("Invalid input!");
            return ZERO;
        }
        return BigDecimal.valueOf(Math.PI).multiply(r.multiply(r)); // to be able to multiply "double" with "BigDecimal".
    }
    public static BigDecimal areaOfRectangle(BigDecimal len, BigDecimal width) { // method for calculating are of a rectangle.
        if (len.compareTo(BigDecimal.ZERO) < 0 || width.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Invalid input!"); // if one of the input values are below zero,
            // an error message prints and the value of zero is returned.
            return ZERO;
        }
        return len.multiply(width);
    }
    public static BigDecimal areaOfTriangle(BigDecimal lenBase, BigDecimal height) { // method for calculating are of a triangle.
        if (lenBase.compareTo(BigDecimal.ZERO) < 0 || height.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Invalid input!");
            return ZERO;
        }
        return lenBase.multiply(height).multiply(BigDecimal.valueOf(0.5)); // to multiply "BigDecimal" with a "double".
    }

    public static void calculateCircleArea() {

        BigDecimal radius = ZERO;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");

        radius = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfCircle(radius);
        // Display output
        if (result.compareTo(BigDecimal.ZERO) != 0) { // if the returned value is not of zero, then
        System.out.println("The circle's area is " + result); // result message is printed.
        } /* otherwise, nothing gets printed except for the error message. Without this statement, the error message is
         printed with the result message.*/
    }

    public static void calculateRectangleArea() {
        BigDecimal length = ZERO;
        BigDecimal width = ZERO;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");

        length = keyboard.nextBigDecimal();

        // Get width
        System.out.print("Enter width? ");
        width = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfRectangle(length, width);
        // Display output
        if (result.compareTo(BigDecimal.ZERO) != 0) {
            System.out.println("The circle's area is " + result);
        }
    }

    public static void calculateTriangleArea() {
        BigDecimal base = ZERO;
        BigDecimal height = ZERO;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        base = keyboard.nextBigDecimal();

        // Get the height
        System.out.print("Enter triangle's height? ");
        height = keyboard.nextBigDecimal();

        BigDecimal result = CalculateArea.areaOfTriangle(base, height);
        // Display the triangle's area.
        if (result.compareTo(BigDecimal.ZERO) != 0) {
            System.out.println("The circle's area is " + result);
        }
    }
}
