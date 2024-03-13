package io.codelex.classesandobjects.practice;

public class CarClass {
    public static void main(String[] args) {
        FuelGauge carFuelGauge = new FuelGauge();
        Odometer carOdometer = new Odometer(carFuelGauge);

        for (int i = 0; i < 15; i++) {
            carFuelGauge.addFuel();
        }

        while (carFuelGauge.getFuelStatus() > 0) {
            carOdometer.increaseMileage();
            System.out.println("Mileage: " + carOdometer.getMileage() + "km.");
            System.out.println("Fuel left: " + carFuelGauge.getFuelStatus() + "l.");
        }
    }
}

class FuelGauge {
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

class Odometer {
    private int mileageStatus;
    private FuelGauge fuel;

    public Odometer(FuelGauge fuelGauge) { // constructor.
        this.mileageStatus = 0;
        this.fuel = fuelGauge;
    }

    public int getMileage() { // to report mileage.
        return mileageStatus;
    }

    public void increaseMileage() { // increments fuel by one L if possible.
        if (this.mileageStatus < 999999) {
            this.mileageStatus++;
        } else {
            this.mileageStatus = 0;
            System.out.println("Odometer reset.");
        }
        if (this.mileageStatus % 10 == 0) {
            this.fuel.consumeFuel();
        }
    }
}
