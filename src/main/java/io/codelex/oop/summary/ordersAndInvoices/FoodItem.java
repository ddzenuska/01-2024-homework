package io.codelex.oop.summary.ordersAndInvoices;

import java.text.DateFormat;

public class FoodItem extends AbstractItem {

    private String expDate;

    protected FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.expDate = bestBefore;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(DateFormat expDate) {
        this.expDate = expDate.toString();
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", getItemName(), getPrice(), getExpDate()); // regex for simpler look
    }
}
