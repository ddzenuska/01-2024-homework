package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private Integer currentSpeed = 0;

    public Audi(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
