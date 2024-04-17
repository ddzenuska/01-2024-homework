package io.codelex.polymorphism.practice.exercise6;

import java.util.List;

public abstract class Food {
    public int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food quantity: " + quantity;
    }

    public abstract boolean isFoodValid(String foodType);
}
