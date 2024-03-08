package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        int a = 1; // changed from String data type to int data type
        int b = 2; // changed from Integer to int data type
        int c = 3;
        int d = 4; // changed from double to int, because the supplied number 4 isn't a decimal number
        int e = 5; // changed from float to int, because the supplied number 5 isn't a fractional number

        int sum = a + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        int a = 1; // changed from String data type to int data type
        int b = 2; // changed from Integer to int data type
        int c = 3;
        double d = 4.2;
        double e = 5.3; // changed 5.4 to 5.3 to gain the correct result of 15.5 instead of 15.6.
        
        double sum = a + b + c + d + e;
        System.out.println(sum);
    }
}
