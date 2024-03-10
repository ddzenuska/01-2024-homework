package io.codelex.classesandobjects.practice;

public class Product {
    String product;
    double startingPrice;
    int startingAmount;

    public static void main(String[] args) {

        Product banana = new Product("Logitech mouse", 70.00, 13);
        banana.printProduct();
        banana.changeQuantity(3);

        banana.changePrice(5);
        banana.printProduct();
    }

    public Product(String name, double priceAtStart, int amountAtStart) {
        product = name;
        startingPrice = priceAtStart;
        startingAmount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(product + ", price " + startingPrice + " amount " + startingAmount);
    }

    public void changeQuantity(int amount) {
        startingAmount -= amount;
    }

    public void changePrice(double price) {
        startingPrice -= price;
    }
}
