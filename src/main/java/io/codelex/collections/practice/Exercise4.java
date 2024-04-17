package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        while (true) {
            System.out.print("Enter name: ");
            String input = in.nextLine();
            if (!input.isBlank()) {
                names.add(input);
            } else {
                break;
            }
        }

        Set<String> uniqueNames = new HashSet<>(names); // this stores unique user input elements.

        System.out.print("Unique names list contains: ");
        for (String name : uniqueNames) {
            System.out.print(name);
            System.out.print(" ");
        }
    }
}
