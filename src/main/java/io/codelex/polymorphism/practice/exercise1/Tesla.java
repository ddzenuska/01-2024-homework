package io.codelex.polymorphism.practice.exercise1;

public class Tesla {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed += 20;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }
}
