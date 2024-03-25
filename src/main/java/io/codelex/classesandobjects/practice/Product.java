package io.codelex.classesandobjects.practice;

public class Product {
    private String product;
    private double startingPrice;
    private int startingAmount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.product = name;
        this.startingPrice = priceAtStart;
        this.startingAmount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.product + ", price " + this.startingPrice + " amount " + this.startingAmount);
    }

    public void changeQuantity(int amount) {
        this.startingAmount -= amount;
    }

    public void changePrice(double price) {
        this.startingPrice -= price;
    }
}
