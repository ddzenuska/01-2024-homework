package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {

        Product banana = new Product("Logitech mouse", 70.00, 13);
        banana.printProduct();
        banana.changeQuantity(3);

        banana.changePrice(5);
        banana.printProduct();
    }
}
