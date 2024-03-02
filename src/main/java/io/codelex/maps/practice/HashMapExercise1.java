package io.codelex.maps.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");

        //TODO: Print size of myMap
        //System.out.println("Size of the hash map: " + ...);

        //TODO: Check if myMap contains key 3
        //if (?) {
        //  System.out.println("Contains! :)");
        //} else {
        //  System.out.println("Does not contains. :(");
        //}

        //TODO: Check if myMap contains value "White"
        //if (?) {
        //  System.out.println("Contains! :)");
        //} else {
        //  System.out.println("Does not contains. :(");
        //}

        //TODO: Create new map and clone values from myMap into new map
        //...

        //TODO: Iterate over map entries and print keys and values of each entry
        //for(Map.Entry entry: myMap.entrySet()){
        //  System.out.println(?);
        //}

        //TODO: Clear myMap
        System.out.println("Hash map after clearing: " + myMap);
    }

}
