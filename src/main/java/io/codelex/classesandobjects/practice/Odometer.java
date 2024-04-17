package io.codelex.classesandobjects.practice;

public class Odometer {
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
