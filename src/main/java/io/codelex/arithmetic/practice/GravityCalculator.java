package io.codelex.arithmetic.practice;

public class GravityCalculator {

    public static double gravCalculator(double a, double t, double vi, double xi) { // method as the formula.

        return 0.5 * (a * (t * t) + (vi * t) + (xi)); // returning final position value (x(t)).
    }
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;

        double finalPosition = gravCalculator(gravity, fallingTime, initialVelocity, initialPosition);

        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + "m.");
    }
}

