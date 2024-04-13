package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class PrinterTest {
    public static void main(String[] args) {
        Printer<Integer> valueOne = new Printer<>(5);
        valueOne.print();

        Printer<String> valueTwo = new Printer<>("something");
        valueTwo.print();

        Printer<BigDecimal> valueThree = new Printer<>(new BigDecimal("4.125879325"));
        valueThree.print();
    }
}
