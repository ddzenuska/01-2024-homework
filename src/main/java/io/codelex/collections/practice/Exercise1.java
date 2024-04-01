package io.codelex.collections.practice;

import java.util.*; // to not individually import set, hashmap, hashset, arraylist etc.
import java.util.stream.Collectors;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */

public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> hashSetOneWay = new HashSet<>(Arrays.asList(array));
        Set<String> hashSet2ndWay = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(hashSetOneWay);
        System.out.println(hashSet2ndWay);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        String[] origin = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};
        Map<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], origin[i]);
        }

        System.out.println(hashMap);
    }
}
