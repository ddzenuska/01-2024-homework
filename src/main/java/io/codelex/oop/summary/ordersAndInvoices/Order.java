package io.codelex.oop.summary.ordersAndInvoices;

import java.util.ArrayList;
import java.util.List;

public class Order {

    protected List<Item> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public List<Item> getItems() {
        return itemList;
    }

    /* Iterates through the list and returns a string with the items full info. Used in formattedInvoice() */
    public String listItems() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            stringBuilder.append(itemList.get(i).fullInfo() + "\n");
        }
        return stringBuilder.toString();
    }
}