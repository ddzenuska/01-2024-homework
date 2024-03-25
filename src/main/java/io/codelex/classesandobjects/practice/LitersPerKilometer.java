package io.codelex.classesandobjects.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        double startKm, endKm, fuelConsumption;

        System.out.print("Enter first reading: ");
        startKm = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKm = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        fuelConsumption = scan.nextDouble();

        Car car = new Car(startKm, endKm, fuelConsumption);

        System.out.println("Liters per a 100 kilometer: " + df.format(car.calculateConsumption()) + "l.");
        car.gasHog();
        car.economyCar();
    }
}