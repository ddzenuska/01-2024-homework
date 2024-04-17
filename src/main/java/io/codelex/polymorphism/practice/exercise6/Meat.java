package io.codelex.polymorphism.practice.exercise6;


public class Meat extends Food {
    private String foodType = "meat";

    public Meat(int quantity) {
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
