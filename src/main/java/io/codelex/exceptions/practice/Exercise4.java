package io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } /* todo -
         catch (NonPositiveNumberException e) {
        System.out.println("Result will be imaginary number.");
        }
        */
    }

    static double getInput(String s) {
        double d = new Double(s).doubleValue();
        // Throw an NonPositiveNumberException if d is less than 0
        return d;
    }
}
