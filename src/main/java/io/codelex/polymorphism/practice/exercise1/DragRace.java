package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of each car and add them to a list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Mercedes(10));
        cars.add(new Toyota(1));
        cars.add(new Audi(5));
        cars.add(new Bmw(1));
        cars.add(new Lexus(3));
        cars.add(new Tesla(50));

        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.speedUp();

                if (i == 2 && car instanceof Boost) {
                    ((Boost) car).useNitrousOxideEngine();
                }
            }
        }

        Car fastestCar = getFastestCar(cars);

        System.out.println(fastestCar.getClass().getSimpleName() + " is the fastest car with speed of " + fastestCar.showCurrentSpeed() + "km/h.");
    }

    public static Car getFastestCar(List<Car> cars) {
        Car fastest = cars.get(0);
        int maxSpeed = Integer.MIN_VALUE;

        for (Car car : cars) {
            if (Integer.parseInt(car.showCurrentSpeed()) > maxSpeed) {
                maxSpeed = Integer.parseInt(car.showCurrentSpeed());
                fastest = car;
            }
        }
        return fastest;
    }
}
