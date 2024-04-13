package io.codelex.oop.summary.ordersAndInvoices;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, power: %dW", getItemName(), getPrice(), getPower());
    }
}
