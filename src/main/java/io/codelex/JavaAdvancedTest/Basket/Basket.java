package io.codelex.JavaAdvancedTest.Basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    protected List<T> items;
    private static final int ALLOWED_MAX_ITEMS = 10;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (items.size() == ALLOWED_MAX_ITEMS) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
    }

    public void removeFromBasket() {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is empty");
        }
        items.remove(items.size() - 1);
    }

    public int getItemCount() {
        return items.size();
    }
}
