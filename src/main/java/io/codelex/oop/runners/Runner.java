package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(250, 360),
    INTERMEDIATE(170, 249),
    ADVANCED(100, 169);

    private final int minMinutes;
    private final int maxMinutes;

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    public int getMinMinutes() {
        return minMinutes;
    }

    public int getMaxMinutes() {
        return maxMinutes;
    }

    public static Runner getFitnessLevel(int marathonCompletionTime) {
        for (Runner runner : Runner.values()) {
            if (marathonCompletionTime <= runner.getMaxMinutes() && marathonCompletionTime >= runner.getMinMinutes()) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Please provide a valid marathon completion time.");
    }
}
