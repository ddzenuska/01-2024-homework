package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("> Piik-piik");
    }

    @Override
    void eat(Food food) {
        if (food.isFoodValid("Vegetable")) {
            foodEaten.put("Vegetable", foodEaten.getOrDefault("Vegetable", 0) + food.getQuantity());
        } else {
            System.out.println(animalType + "are not eating that type of food!");
        }
    }
}
