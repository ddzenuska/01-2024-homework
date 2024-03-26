package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManuf;
    private final List<Manufacturer> manufacturer;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManuf, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManuf = yearOfManuf;
        this.engineType = engineType;
        this.manufacturer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManuf() {
        return yearOfManuf;
    }

    public void setYearOfManuf(int yearOfManuf) {
        this.yearOfManuf = yearOfManuf;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void addToManufacturer(Manufacturer... manufacturers) { // to able to add one car to many manufacturers at once
        for (Manufacturer manufacturer : manufacturers) {
            this.manufacturer.add(manufacturer);
        }
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    enum EngineType { // defined the engine type enum here
        V12,
        V8,
        V6,
        S6,
        S4,
        S3,
        i6,
        i4,
        i2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(yearOfManuf, car.yearOfManuf) && Objects.equals(manufacturer, car.manufacturer) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManuf, manufacturer, engineType);
    }

    @Override
    public String toString() {
        return name + " (model '" + model + "\')" +
                " with the price at " + price + '$' +
                " manufactured in " + yearOfManuf +
                " by " + getManufacturer() +
                ". The car's engine type is " + engineType + ".";
    }
}
