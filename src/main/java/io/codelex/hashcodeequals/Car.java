package io.codelex.hashcodeequals;

public class Car {
    private final String brand;
    private final String make;
    private final String vin;

    public Car(String brand, String make, String vin) {
        this.brand = brand;
        this.make = make;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals called");
        throw new IllegalStateException();
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        return 1;
    }
}
