package io.codelex.classesandobjects.practice;

public class Product {
    private String product;
    private double startingPrice;
    private int startingAmount;

    public static void main(String[] args) {

        Product banana = new Product("Logitech mouse", 70.00, 13);
        banana.printProduct();
        banana.changeQuantity(3);

        banana.changePrice(5);
        banana.printProduct();
    }

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
