package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food {
    private String foodType = "vegetable";

    public Vegetable(int quantity) {
        super(quantity);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean isFoodValid(String food) {
        return foodType.equalsIgnoreCase(food);
    }
}
