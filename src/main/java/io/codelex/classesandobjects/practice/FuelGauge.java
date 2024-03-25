package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuelStatus;

    public FuelGauge() { // constructor.
        this.fuelStatus = 0;
    }

    public int getFuelStatus() { // if needed to report amount.
        return fuelStatus;
    }

    public void addFuel() { // increments fuel by one L if possible.
        if (this.fuelStatus < 70) {
            this.fuelStatus++;
        } else {
            System.out.println("The car is full!");
        }
    }

    public void consumeFuel() { // decrements fuel by one L if possible.
        if (this.fuelStatus > 0) {
            this.fuelStatus--;
        } else {
            System.out.println("Car's fuel tank is empty!");
        }
    }
}