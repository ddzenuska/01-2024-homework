package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double fuelAmount;

    public Car(double firstOdoReading) {
        this.startKilometers = firstOdoReading;
        this.endKilometers = firstOdoReading;
        this.fuelAmount = 0;
    }

    // For LitersPerKilometer.java
//    public Car(double startOdo, double endingOdo, double liters) {
//        this.startKilometers = startOdo;
//        this.endKilometers = endingOdo;
//        this.fuelAmount = liters;
//    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        fuelAmount += liters;
    }

    public double calculateConsumption() {
        return (endKilometers - startKilometers) / fuelAmount;
    }

    // For LitersPerKilometer.java
//    public double calculateConsumption() {
//        return (startKilometers - endKilometers) / fuelAmount;
//    }

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
