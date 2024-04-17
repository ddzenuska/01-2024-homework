package io.codelex.oop.cars;

import static io.codelex.oop.cars.Car.EngineType.*;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer toyota = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer mercedes = new Manufacturer("MercedesBenz", 1926, "Germany");
        Manufacturer honda = new Manufacturer("Honda", 1948, "Japan");

        Car genZ = new Car("3.series", "e36", 8.987, 1994, i6);
        genZ.addToManufacturer(bmw);
        Car supra = new Car("Toyoa GR Supre", "GR Supra", 48.898, 2023, i6);
        supra.addToManufacturer(toyota, bmw);
        Car E220d = new Car("Mercedes-Benz E220d", "W213", 50.372, 2016, i4);
        E220d.addToManufacturer(mercedes);
        Car S600 = new Car("Mercedes-Benz S600", "W140", 27.989, 2000, V12);
        S600.addToManufacturer(mercedes);

        E220d.setPrice(89.798);

        System.out.println(E220d);
        System.out.println(supra);
        System.out.println(S600);
        System.out.println(genZ + "\n");

        CarService service = new CarService();
        service.addCar(genZ);
        service.addCar(supra);
        service.addCar(E220d);
        service.addCar(S600);

        System.out.println("Cheapest car is: " + service.cheapestCar() + "\n");
        System.out.println("Cars with a V12 engine: " + (service.carsWithV12()) + "\n");
        System.out.println("Cars manufactured before 1999: " + service.getCarsPre1999() + "\n");
        System.out.println("Most expensive car " + service.mostExpensiveCar() + "\n");
        System.out.println(service.getListOfCars() + "\n");
        System.out.println("Cars sorted: " + service.sortCars("ascending") + "\n");
        System.out.println("Cars manufactured by bmw: " + service.getCarsByManufacturer("BMW") + "\n");
        System.out.println(service.getCarsByManufacturerAndEstablishment("BMW", "=", 1916));
    }
}
