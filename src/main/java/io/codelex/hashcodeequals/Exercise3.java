package io.codelex.hashcodeequals;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Audi", "R8", "123"));
        cars.add(new Car("BMW", "i8", "456"));
        cars.add(new Car("Mercedes", "G55", "789"));

        // todo - make sure that equals is never invoked
        System.out.println(cars.contains(new Car("Audi", "A3", "000")));
    }
}
