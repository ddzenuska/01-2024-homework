package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car, Boost {
    private Integer currentSpeed = 0;

    public Mercedes(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 25;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
