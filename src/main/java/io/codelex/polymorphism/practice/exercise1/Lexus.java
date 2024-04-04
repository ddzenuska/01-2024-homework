package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {
    private Integer currentSpeed = 0;

    public Lexus(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
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
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
