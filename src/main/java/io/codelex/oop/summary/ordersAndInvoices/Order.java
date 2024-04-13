package io.codelex.oop.summary.ordersAndInvoices;

import io.codelex.oop.summary.generics.Printer;

import javax.crypto.SealedObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Order {

    protected List<SellableThing> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        if (item instanceof FoodItem) { // if the item is a food item, checks if the expiration date is not less than today
            FoodItem foodItem = (FoodItem) item;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // formats for the expiration date
            if (LocalDate.parse(foodItem.getExpDate(), formatter).isBefore(LocalDate.now())) {
                throw new BadFoodException("Cannot add a food item with an expiration date less than today.");
            }
        }
        this.itemList.add(item);
    }

    public List<SellableThing> getItems() {
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