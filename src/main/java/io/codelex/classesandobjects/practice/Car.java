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