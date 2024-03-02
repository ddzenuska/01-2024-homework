package io.codelex.comparing.examples;

import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("Duplicates")
public class TreeSetExample {
    public static void main(String[] args) {
        final Set<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
        //Fruits Set : [Apple, Banana, Orange, Pineapple]

        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);
        //After adding duplicate element "Apple" : [Apple, Banana, Orange, Pineapple]

        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
        //After adding "banana" : [Apple, Banana, Orange, Pineapple, banana]
    }
}
