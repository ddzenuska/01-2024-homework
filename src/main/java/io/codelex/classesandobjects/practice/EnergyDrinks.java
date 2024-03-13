package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final static int NUMBERED_SURVEYED = 12467; // changed to static so static methods can access.
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        int energyDrinkers = (int) calculateEnergyDrinkers(NUMBERED_SURVEYED); // created variables with results.
        int preferCitrus = (int) calculatePreferCitris(NUMBERED_SURVEYED);

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS;
    }
}
