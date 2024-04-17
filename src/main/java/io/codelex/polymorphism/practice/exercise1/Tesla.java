package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;

    public Tesla(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
