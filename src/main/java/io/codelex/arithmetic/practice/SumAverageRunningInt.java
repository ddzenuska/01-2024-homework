package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0; // re-declared as a "double" to be a decimal, and initialized for the print statements.
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number; // every iteration is added to the "sum" variable.
            average = (double) sum / (upperBound - lowerBound + 1); /* calculating average. Used "double" in brackets
             for the calculation to be done in floating-point arithmetics, otherwise the result is calculated
             as an integer, outputting 50.0*/
        }

        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.println("The average is " + average);
    }
}
