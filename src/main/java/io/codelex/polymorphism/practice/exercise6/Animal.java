package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    protected String livingRegion;
    protected Map<String, Integer> foodEaten;

    public Animal(String animalName, String animalType, double animalWeight, String livingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.livingRegion = livingRegion;
        this.foodEaten = new HashMap<>();
    }

    abstract void makeSound();

    abstract void eat(Food food);

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public Map<String, Integer> getFoodEaten() {
        return foodEaten;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder foodSummary = new StringBuilder();
        for (Map.Entry<String, Integer> entry : foodEaten.entrySet()) {
            foodSummary.append(entry.getKey()).append(" ").append(entry.getValue()).append(", ");
        }
        if (!foodSummary.isEmpty()) {
            foodSummary.setLength(foodSummary.length() - 2);
        }
        return animalType + "[" + animalName + ", " + animalType + ", " + df.format(animalWeight) + ", " + livingRegion + ", " +
                foodSummary.toString() + "]";
    }

}
