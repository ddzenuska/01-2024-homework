package io.codelex.oop.summary.ordersAndInvoices;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, color: %s", getItemName(), getPrice(), getColor());
    }
}
