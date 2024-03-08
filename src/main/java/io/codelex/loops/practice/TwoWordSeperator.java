package io.codelex.loops.practice;

import java.util.Scanner;

public class TwoWordSeperator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        if (in.hasNextLine()) {
            String firstWord = in.nextLine();
            System.out.print("Second word: ");
            if (in.hasNextLine()) {
                String secondWord = in.nextLine();

                System.out.println(seperator(firstWord, secondWord));
            }
        }
    }

    public static String seperator(String firstW, String secondW) {
        int wordLen = firstW.length() + secondW.length();
        int numberOfDots = 30 - wordLen; // gaining the length and number of dots to use

        StringBuilder result = new StringBuilder(firstW); // used StringBuilder because efficiency and mutability

        for (int i = 0; i < numberOfDots; i++) {
            result.append(".");
        }
        result.append(secondW);

        return result.toString();
    }
}
