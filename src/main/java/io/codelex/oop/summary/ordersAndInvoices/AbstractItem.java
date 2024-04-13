package io.codelex.oop.summary.ordersAndInvoices;

public abstract class AbstractItem implements Item {

    protected String name;
    protected double price;

    protected AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItemName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
