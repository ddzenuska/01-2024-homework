/* I wrote it in an advanced way. This was not easy, and I have a lot to learn and practice to understand
this fully, but I wanted to try to solve problems differently, learn new methods and a little bit about functions. */

package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> listOfCars;

    public CarService() {
        this.listOfCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        listOfCars.add(car);
    }

    public void removeCar(Car car) {
        listOfCars.remove(car);
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public List<Car> carsWithV12() {
        return listOfCars.stream()  /* Used Stream API to convert the list to a sequence of elements
         to .filter() cars and then to collect the results with .collect() */
                .filter(car -> car.getEngineType() == Car.EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsPre1999() {
        return listOfCars.stream()
                .filter(car -> car.getYearOfManuf() < 1999)
                .collect(Collectors.toList());
    }

    public Car mostExpensiveCar() {
        return listOfCars.stream()
                .max(Comparator.comparingDouble(Car::getPrice)) // filtered with max, calling comparator to compare Car prices
                .orElse(null); // if there isnt a car, null will be returned
    }

    public Car cheapestCar() {
        return listOfCars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))// filtered with min, calling comparator to compare Car prices
                .orElse(null);
    }

    public Car carWithAtleast3Manufacturers() {
        return listOfCars.stream()
                .filter(car -> car.getManufacturer().size() >= 3) /* filtered by getting the size of manufacturer list.
                If the list size is more than 3, it means that the car has more than three manufactures */
                .findFirst()
                .orElse(null);
    }

    public List<Car> sortCars(String ascOrDesc) {
        Comparator<Car> comparator = Comparator.comparingDouble(Car::getPrice); // created a Comparator object which compares prices
        if (ascOrDesc.equals("descending")) { // if the argument is "descending" the new object is reversed and only then streamed, sorted and returned.
            comparator = comparator.reversed();
        } // if the argument is not "descending" then list is sorted, compared and returned without a reversal.
        return listOfCars.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public boolean isCarOnList(Car whichCar) {
        return listOfCars.stream() // used anyMatch to find a match of a car that equals the car provided as the argument
                .anyMatch(car -> car.equals(whichCar));
    }

    public List<Car> getCarsByManufacturer(String manufactName) {
        return listOfCars.stream()
                .filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getName().equals(manufactName)))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerAndEstablishment(String manufactName, String comparison, int yearOfEst) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : listOfCars) { // iterated through each car and manufacturer
            for (Manufacturer manufacturer : car.getManufacturer()) {
                if (manufacturer.getName().equals(manufactName) && estYearComparer(manufacturer.getYearOfEst(), yearOfEst, comparison)) {
                    filteredCars.add(car); // Used estYearComparer to get a boolean for the comparison. If true is returned, the loop breaks and the result is returned.
                    break;
                }
            }
        }
        return filteredCars;
    }

    private boolean estYearComparer(int firstYear, int secondYear, String comparison) {
        return switch (comparison) {
            case "<" -> firstYear < secondYear;
            case "<=" -> firstYear <= secondYear;
            case "=" -> firstYear == secondYear;
            case " >=" -> firstYear >= secondYear;
            case ">" -> firstYear > secondYear;
            case "!=" -> firstYear != secondYear;
            default -> throw new IllegalArgumentException("Invalid comparison operator supplied");
        };
    }

    @Override
    public String toString() {
        return "CarService{" +
                "listOfCars=" + listOfCars +
                "}\n";
    }
}
