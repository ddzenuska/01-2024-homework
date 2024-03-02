package io.codelex.comparing.examples;

import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("Duplicates")
public class TreeSetWithComparatorExample {
    public static void main(String[] args) {
        final Set<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
        //Fruits Set : [Apple, Banana, Orange, Pineapple]

        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
        //After adding "banana" : [Apple, Banana, Orange, Pineapple]
    }
}
