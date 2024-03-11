package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, fuelConsumption;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        fuelConsumption = scan.nextDouble();

//        Car car = new Car(startKilometers, endKilometers, fuelConsumption);

//        System.out.println("Kilometers per liter are " + car.calculateConsumption() + "km.");
//        System.out.println("A gas hog? " + car.gasHog());
//        System.out.println("An economy car? " + car.economyCar());
    }
}
