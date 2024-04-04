package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {
    private Integer currentSpeed = 0;

    public Toyota(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 5;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
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
        return "Toyota{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
