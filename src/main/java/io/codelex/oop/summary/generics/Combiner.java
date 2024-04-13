package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("3.14159265358979323846");
        System.out.println(combineTwoItems(12, bigDecimal));
        System.out.println(combineTwoItems(5, "something"));
        System.out.println(combineTwoItems(5.53434, -12093));
    }

    public static <T, N> String combineTwoItems(N first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}
