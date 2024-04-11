package io.codelex.oop.summary.ordersAndInvoices;

public class ItemPacking implements Service {
    private final String name = "item packing";
    private final double price = 5;

    @Override
    public String getItemName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String fullInfo() {
        return this.name + ", " + String.format("%.2f", this.price) + " EUR";
    }
}