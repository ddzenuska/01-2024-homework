package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {

    public static int padDigits(char strChar) { // converts characters, gained from "converter" method, in to numbers.
        return switch (strChar) { // used new version of switch statements
            case 'a', 'b', 'c' -> 2;
            case 'd', 'e', 'f' -> 3;
            case 'g', 'h', 'i' -> 4;
            case 'j', 'k', 'l' -> 5;
            case 'm', 'n', 'o' -> 6;
            case 'p', 'q', 'r', 's' -> 7;
            case 't', 'u', 'v' -> 8;
            case 'w', 'x', 'y', 'z' -> 9;
            case ' ' -> 0; // if there is a space.
            default -> -1; // if there are invalid characters such as numbers.
        };
    }

    public static void converter(String str) { // converts string in to digits.
        for (int i = 0; i < str.length(); i++) { // iterates through user provided string characters
            int result = padDigits(str.charAt(i)); // calls "padDigits" method on currently iterated character and stores digit.

            System.out.print(result); // prints digit on each iteration on one line.
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please provide a text to convert: ");
        if (in.hasNext()) {
            String text = in.nextLine().toLowerCase(); // if the input is a String, then it proceeds to call "converter" method on it.
            System.out.print("\nText in digits: "); // prints result message on one line with the converted text digits.
            converter(text);
        } else {
            System.err.println("Invalid input!");
        }
    }
}
