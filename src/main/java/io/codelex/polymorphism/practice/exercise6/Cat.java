package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("> Meoww");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void eat(Food food) {
        foodEaten.put(food.getClass().getSimpleName(), foodEaten.getOrDefault(food.getClass().getSimpleName(), 0) + food.getQuantity());
    }
}
