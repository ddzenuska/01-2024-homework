package io.codelex.classesandobjects.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double fuelAmount;

    public Car(double firstOdoReading) {
        this.startKilometers = firstOdoReading;
        this.endKilometers = firstOdoReading;
        this.fuelAmount = 0;
    }

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.fuelAmount = liters;
    }

    public void fillUp(int mileage, double liters) { // startKm value is rewritten for class CarTest to work properly.
        this.startKilometers = mileage;
        this.fuelAmount += liters;
    }

    public double calculateConsumption() {
        return (fuelAmount / (startKilometers - endKilometers)) * 100;
    }

    public boolean gasHog() {
        if (calculateConsumption() > 15) {
            System.out.println("The car is a gas hog.");
            return true;
        }
        return false;
    }

    public boolean economyCar() {
        if (calculateConsumption() < 5) {
            System.out.println("The car is economical.");
            return true;
        }
        return false;
    }
}

// Create a test class to verify how Car works:
class LitersPerKilometer {
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

// Write a testing class with a main() that constructs a car and calls fillUp() and calculateConsumption() a few times.
class CarTest {
    public static void main(String[] args) {
        Car testCar = new Car(400);
        testCar.fillUp(750, 30);
        testCar.fillUp(1200, 50);

        System.out.println("Fuel consumption is " + testCar.calculateConsumption() + " liters/100km");
        System.out.println("A gas hog? " + testCar.gasHog());
        System.out.println("An economy car? " + testCar.economyCar());

    }
}