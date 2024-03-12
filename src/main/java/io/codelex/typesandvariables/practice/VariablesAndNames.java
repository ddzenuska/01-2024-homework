package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven, avgPassengersPerCar;
        double seatsInACar, carPoolCapacity;

        cars = 100; //cars
        seatsInACar = 4.0; //seats in a car
        drivers = 30; // drivers
        passengers = 90; // passengers
        carsNotDriven = cars - drivers; // free cars
        carsDriven = drivers; // cars driven at the moment
        carPoolCapacity = carsDriven * seatsInACar; // carpool capacity
        avgPassengersPerCar = passengers / carsDriven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carPoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + avgPassengersPerCar + " in each car.");
    }
}