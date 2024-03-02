package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double seats_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100; //cars
        seats_in_a_car = 4.0; //seats in a car
        drivers = 30; // drivers
        passengers = 90; // passengers
        cars_not_driven = cars - drivers; // free cars
        cars_driven = drivers; // cars driven at the moment
        carpool_capacity = cars_driven * seats_in_a_car; // carpool capacity
        average_passengers_per_car = passengers / cars_driven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
    }
}