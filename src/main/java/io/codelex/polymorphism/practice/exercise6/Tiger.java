package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("> RRarrrR");
    }

    @Override
    void eat(Food food) {
        if (food.isFoodValid("Meat")) {
            foodEaten.put("Meat", foodEaten.getOrDefault("Meat", 0) + food.getQuantity());
        }
    }
}
