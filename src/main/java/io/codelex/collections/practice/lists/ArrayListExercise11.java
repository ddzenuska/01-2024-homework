package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        String[] randValues = {"phone", "wallet", "cat", "random", "pencil", "car", "store", "language", "laptop", "book"};
        for (String value : randValues) {
            arrayList.add(value);
        }
        System.out.println(arrayList);

        //TODO: Add new value at 5th position
        arrayList.add(4, "machine");
        System.out.println(arrayList);

        //TODO: Change value at last position (Calculate last position programmatically)
        arrayList.set(arrayList.size() - 1, "person");
        System.out.println(arrayList);

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //TODO: Check if your list contains "Foobar" element
        System.out.println(arrayList.contains("Foobar") ? "Contains" : "Does not contain");

        //TODO: Print each element of list using loop
        for (String element : arrayList)
            System.out.println(element);
    }

}
