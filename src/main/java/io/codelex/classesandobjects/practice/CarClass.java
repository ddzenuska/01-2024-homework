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
