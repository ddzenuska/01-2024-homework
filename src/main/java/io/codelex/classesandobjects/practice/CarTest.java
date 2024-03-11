package io.codelex.classesandobjects.practice;

public class CarTest {
    public static void main(String[] args) {
        Car testCar = new Car(400);
        testCar.fillUp(750, 30);
        testCar.fillUp(1200, 50);

        System.out.println("Fuel consumption is " + testCar.calculateConsumption() + " kilometers per liter");
        System.out.println("A gas hog? " + testCar.gasHog());
        System.out.println("An economy car? " + testCar.economyCar());

    }
}
