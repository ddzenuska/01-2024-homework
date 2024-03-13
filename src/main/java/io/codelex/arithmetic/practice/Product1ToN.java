package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {

        int N = 10;
        int sum = 1;

        for (int i = 1; i <= N; i++) { // "for loop" iterates from 1 to N
            sum *= i; // multiplying each previous iterations result by itself to calculate the PRODUCT

            System.out.println(i + " * " + sum); // prints each iterations calculation for visual reference
        }

        System.out.println("\nProduct: " + sum); // prints result
    }
}
