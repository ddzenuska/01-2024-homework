package io.codelex.oop.runners;

public class RunnerTest {
    public static void main(String[] args) {
        int[] runTimes = {170, 130, 140};
        for (int runTime : runTimes) {
            Runner runner = Runner.getFitnessLevel(runTime);
            System.out.println("Fitness level: " + runner);
        }
    }
}
