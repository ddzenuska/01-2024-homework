package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class StorageHouseTest {
    public static void main(String[] args) {
        StorageHouse<Object> values = new StorageHouse<>(1234);
        values.addMoreItems("random");
        values.addMoreItems("string");
        values.addMoreItems(new BigDecimal("274891.2314"));
        values.addMoreItems(-0.1);

        System.out.println(values.getMaybeFirstItem());
        values.printItems();
    }
}
