package io.codelex.JavaAdvancedTest.Basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

public class BasketTest {

    @Test
    public void testBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        Basket<Mushroom> mushroomBasket = new Basket<>();

        IntStream.range(0, 10).forEach(i -> {
            appleBasket.addToBasket(new Apple());
            mushroomBasket.addToBasket(new Mushroom());
        });

        assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(new Apple()));
        assertThrows(BasketFullException.class, () -> mushroomBasket.addToBasket(new Mushroom()));

        IntStream.range(0, 10).forEach(i -> {
            appleBasket.removeFromBasket();
            mushroomBasket.removeFromBasket();
        });

        assertThrows(BasketEmptyException.class, appleBasket::removeFromBasket);
        assertThrows(BasketEmptyException.class, mushroomBasket::removeFromBasket);
    }
}